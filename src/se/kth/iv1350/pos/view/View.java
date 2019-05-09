package se.kth.iv1350.pos.view;

import se.kth.iv1350.pos.controller.Controller;

/**
 * This program has no view, instead this class is a placeholder 
 * for the entire view.
 */

public class View {
	private Controller contr;
	
	/**
	 * Creates a new instance
	 * @param contr The controller that is used for all operations
	 */
	public View(Controller contr) {
		this.contr = contr;
	}
	
	/**
	 * Hard-coded code to represent the view
	 */
	public void start() {
		contr.startNewSale();
		contr.addItem(2, 2);
		double totalPriceBeforeDiscount = contr.startPayment();
		System.out.println(totalPriceBeforeDiscount);
		double change = contr.checksForDiscount(2, 300, totalPriceBeforeDiscount);
		System.out.println(change);
	}
}
