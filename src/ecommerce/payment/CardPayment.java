package ecommerce.payment;

public class CardPayment extends Payment {
    private String cardNumber;

    public CardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("Paid ₹" + getAmount() + " using Card ending in: " + cardNumber.substring(cardNumber.length() - 4));
    }
}