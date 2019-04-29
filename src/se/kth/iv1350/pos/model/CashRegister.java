package se.kth.iv1350.pos.model;

import se.kth.iv1350.pos.DTO.Receipt;
import se.kth.iv1350.pos.dbHandler.AccountingRegistry;

public class CashRegister {

	private Receipt receipt;
	private AccountingRegistry accRe;
	
	public CashRegister() {
		Receipt receipt = new Receipt();
		AccountingRegistry accRe = new AccountingRegistry();
	}
	
	public double addPayment(double cash, double totalPrice) {
		
		double change = cash - totalPrice;
		receipt.addTotalPriceAndChange(totalPrice, change, cash);
		accRe.accountingUpdate(totalPrice);
		
		return change;
	}

}
