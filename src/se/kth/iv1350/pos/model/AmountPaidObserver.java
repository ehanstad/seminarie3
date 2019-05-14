package se.kth.iv1350.pos.model;

/**
 * Notified when the payment is on the go.
 */
public interface AmountPaidObserver {
	
	/**
	 * Called on when the payment is on the go.
	 * 
	 * @param totalAmountPaid The amount of money paid since program 
	 * started.
	 */
	void newSalePaid(double totalAmountPaid);
}
