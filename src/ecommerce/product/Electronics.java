package ecommerce.product;
public class Electronics extends Product {
    private String brand;
    private int warranty;

    public Electronics(String id, String name, double price, int stock, String brand, int warranty) {
        super(id, name, price, stock);
        this.brand = brand;
        this.warranty = warranty;
    }

    @Override
    public String displayDetails() {
        return "Electronics: " + getName() + " | Brand: " + brand + " | Warranty: " + warranty + " months | Price: ₹" + price + " | Stock: " + stock;
    }
}
