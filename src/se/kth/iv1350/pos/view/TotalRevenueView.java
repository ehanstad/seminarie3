package se.kth.iv1350.pos.view;

import se.kth.iv1350.pos.model.AmountPaidObserver;

/**
 * Works as a alternative display witch shows the total amount paid 
 * for purchases since the program started.
 */
public class TotalRevenueView implements AmountPaidObserver {

	public double totalAmountPaid;
	
	@Override
	public void newSalePaid(double newTotalAmountPaid) {
		totalAmountPaid += newTotalAmountPaid;
		showAmountPaid(totalAmountPaid);
	}

	private void showAmountPaid(double totalAmountPaid) {
		System.out.println("Pengar betalade: " + totalAmountPaid);
	}

}
