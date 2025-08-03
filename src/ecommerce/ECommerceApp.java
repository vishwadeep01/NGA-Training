package ecommerce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import ecommerce.customer.Customer;
import ecommerce.discount.Discountable;
import ecommerce.order.Order;
import ecommerce.payment.CardPayment;
import ecommerce.payment.CashOnDelivery;
import ecommerce.payment.Payment;
import ecommerce.payment.UpiPayment;
import ecommerce.product.Book;
import ecommerce.product.Clothing;
import ecommerce.product.Electronics;
import ecommerce.product.Furniture;
import ecommerce.product.Product;

public class ECommerceApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> catalog = Arrays.asList(
            new Electronics("E1", "Laptop", 60000, 2, "Dell", 24),
            new Clothing("C1", "T-Shirt", 800, 4, "L", "Cotton"),
            new Book("B1", "Java Basics", 500, 6, "James Gosling", "Programming"),
            new Furniture("F1", "Chair", 1500, 4, "Wood", "2x2ft")
        );

        System.out.println("Welcome to the E-Commerce App");

        while (true) {
            System.out.print("\nEnter your name: ");
            String name = scanner.nextLine();
            System.out.print("\nEnter your email: ");
            String email = scanner.nextLine();

            Customer customer = new Customer(name, email);

            System.out.print("\nAvailable Products:\n");
            for (int i = 0; i < catalog.size(); i++) {
                System.out.println((i + 1) + ". " + catalog.get(i).displayDetails());
            }

            List<Product> selected = new ArrayList<>();
            do {
                System.out.print("\nSelect product number to add to cart (or 0 to finish): ");
                int prodChoice = scanner.nextInt();
                scanner.nextLine();

                if (prodChoice > 0) {
                    selected.add(catalog.get(prodChoice - 1));
                    System.out.println("\nProduct added to cart.");
                }
                else if (prodChoice == 0) {
                    break;
                }
                else if (prodChoice != 0) {
                    System.out.println("\nInvalid choice.");
                }
            } while (true);
            
            System.out.println("Choose payment method (1 = Card, 2 = Upi, 3 = Cash): ");
            int paymentChoice = scanner.nextInt();
            scanner.nextLine();

            Payment payment = null;
            if (paymentChoice == 1) {
                System.out.println("Enter card number: ");
                String card = scanner.nextLine();
                payment = new CardPayment(card);
            }
            else if (paymentChoice == 2) {
            	System.out.println("Enter Upi Id: ");
                String upiId = scanner.nextLine();
                payment = new UpiPayment(upiId);
            }
            else {
                payment = new CashOnDelivery();
            }

            Discountable discount = price -> price > 50000 ? price * 0.1 : price;

            Order order = new Order(customer, selected);
            order.placeOrder(payment, discount);
            order.saveOrderToFile("orders.txt");

            System.out.println("Do you want to place another order? (yes/no): ");
            String choice = scanner.nextLine().trim().toLowerCase();
            if (!choice.equals("yes")) {
                System.out.println("Thank you! Exiting app.");
                break;
            }
        }

        scanner.close();
    }
}

