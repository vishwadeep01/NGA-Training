package ecommerce.payment;

public abstract class Payment {
    private double amount;
    public abstract void processPayment();
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
}