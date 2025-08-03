package ecommerce.payment;

public class CashOnDelivery extends Payment {
    @Override
    public void processPayment() {
        System.out.println("Payment due on delivery: ₹" + getAmount());
        System.out.println("Paid direct cash ₹" + getAmount());
    }
}