package se.kth.iv1350.pos.model;

import se.kth.iv1350.pos.DTO.Receipt;
import se.kth.iv1350.pos.dbHandler.AccountingRegistry;

/**
 *	This class handles the connection between Accounting registry and controller
 */
public class CashRegister {

	private Receipt receipt;
	private AccountingRegistry accRe;
	
	/**
	 * Creates a new instance representing the cash register
	 */
	public CashRegister() {
		Receipt receipt = new Receipt();
		this.receipt = receipt;
		AccountingRegistry accRe = new AccountingRegistry();
		this.accRe = accRe;
	}
	
	/**
	 * Sends information to the accounting system
	 * @param totalPrice The total price of the sale
	 */
	public void addPayment(double totalPrice) {
		accRe.accountingUpdate(totalPrice);
	}

}
