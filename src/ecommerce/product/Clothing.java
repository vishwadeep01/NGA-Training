package ecommerce.product;

public class Clothing extends Product {
    private String size;
    private String fabric;

    public Clothing(String id, String name, double price, int stock, String size, String fabric) {
        super(id, name, price, stock);
        this.size = size;
        this.fabric = fabric;
    }

    @Override
    public String displayDetails() {
        return "Clothing: " + getName() + " | Size: " + size + " | Fabric: " + fabric + " | Price: ₹" + price + " | Stock: " + stock;
    }
}
