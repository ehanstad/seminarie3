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
		String itemExcistens = contr.addItem(123, 1);
		System.out.println(itemExcistens);
		contr.startPayment();
		double change = contr.checksForDiscount(1, 300);
		System.out.println(change);
	}
}
