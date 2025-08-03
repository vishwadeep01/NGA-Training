package ecommerce.product;

public class Furniture extends Product {
    private String material;
    private String dimensions;

    public Furniture(String id, String name, double price, int stock, String material, String dimensions) {
        super(id, name, price, stock);
        this.material = material;
        this.dimensions = dimensions;
    }

    @Override
    public String displayDetails() {
        return "Furniture: " + getName() + " | Material: " + material + " | Size: " + dimensions + " | Price: ₹" + price + " | Stock: " + stock;
    }
}
