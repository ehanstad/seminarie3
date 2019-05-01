package se.kth.iv1350.pos.model;

import se.kth.iv1350.pos.dbHandler.CustomerRegistry;

public class Discount {
	
	private CustomerRegistry customerRe;
	
	public Discount() {
		
		CustomerRegistry customerRe = new CustomerRegistry();
		this.customerRe = customerRe;
	}
	
	public double calculateDiscount(int customerID, double totalPrice) {
		
		double discount = customerRe.getDiscount(customerID);
		return totalPrice*discount;
	}

}
