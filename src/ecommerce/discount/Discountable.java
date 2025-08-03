package ecommerce.discount;

@FunctionalInterface
public interface Discountable {
    double applyDiscount(double price);
}
