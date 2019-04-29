package se.kth.iv1350.pos.model;

import se.kth.iv1350.pos.dbHandler.CustomerRegistry;

public class Discount {
	
	private CustomerRegistry custumerRe;
	
	public Discount() {
		
		CustomerRegistry custumerRe = new CustomerRegistry();
	}
	
	public double calculateDiscount(int customerID, double totalPrice) {
		
		float discount = custumerRe.getDiscount(customerID);
		return totalPrice*discount;
	}

}
