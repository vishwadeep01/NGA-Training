package ecommerce.order;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import ecommerce.customer.Customer;
import ecommerce.discount.Discountable;
import ecommerce.payment.Payment;
import ecommerce.product.Product;

public class Order {
    private Customer customer;
    private List<Product> products;
    private double totalAmount;
    private boolean isCancelled = false;

    public Order(Customer customer, List<Product> products) {
        this.customer = customer;
        this.products = products;
        this.totalAmount = calculateTotal();
    }

    private double calculateTotal() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    public void placeOrder(Payment payment, Discountable discountable) {
        if (isCancelled) {
            System.out.println("Cannot place order. It has been cancelled.");
            return;
        }

        customer.displayCustomer();
        products.forEach(p -> {
            p.displayDetails();
            if (!p.reduceStock()) {
                System.out.println("Failed to place order due to stock issues.");
                return;
            }
        });

        double discounted = totalAmount- discountable.applyDiscount(totalAmount);
        System.out.println("Total after discount: ₹" + discounted);
        payment.setAmount(discounted);
        payment.processPayment();
    }

    public void cancelOrder() {
        isCancelled = true;
        System.out.println("Order cancelled.");
    }

    public void saveOrderToFile(String filename) {
        File file = new File(filename);
        boolean isNewFile = !file.exists();

        try (FileWriter fileWriter = new FileWriter(file, true)) {
            if (isNewFile) {
                fileWriter.write("=== Order Records ===\n");
            }
            fileWriter.write("New Order Info\n");
            fileWriter.write("Customer Info\n");
            fileWriter.write("Customer: " + customer.getName() + ", Email: " + customer.getEmail() + "\n");

            fileWriter.write("Products Info\n");
            for (Product product : products) {
                fileWriter.write("Product: " + product.getName() + " | Price: ₹" + product.getPrice() + "\n");
            }
            
            fileWriter.write("Total: ₹" + totalAmount + "\n");
            System.out.println("Order details saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
