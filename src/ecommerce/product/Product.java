package ecommerce.product;
public abstract class Product
{
    protected String id;
    private String name;
    protected double price;
    protected int stock;

    public Product(String id, String name, double price, int stock)
    {
        this.id = id;
        this.setName(name);
        this.price = price;
        this.stock = stock;
    }

    public abstract String displayDetails();

    public boolean reduceStock()
    {
        if (stock > 0)
        {
            stock--;
            return true;
        }
        else
        {
            System.out.println("Out of stock: " + getName());
            return false;
        }
    }

    public double getPrice()
    {
        return price;
    }

    public int getStock()
    {
        return stock;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
