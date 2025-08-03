package ecommerce.payment;


public class UpiPayment extends Payment {
    private String upiId;

    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void processPayment() {
        System.out.println("Paid ₹" + getAmount() + " via UPI: " + upiId);
    }
}