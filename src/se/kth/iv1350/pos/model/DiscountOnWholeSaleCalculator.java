package se.kth.iv1350.pos.model;

public class DiscountOnWholeSaleCalculator implements DiscountCalculator {

	@Override
	public double calculateDiscount(int customerID, double totalPrice) {
		double totalPriceAfterDiscount = totalPrice;
		return totalPriceAfterDiscount;
	}

}
