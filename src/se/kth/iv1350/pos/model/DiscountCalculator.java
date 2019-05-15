package se.kth.iv1350.pos.model;

public interface DiscountCalculator {

	public double calculateDiscount(int customerID , double totalPrice);
}
