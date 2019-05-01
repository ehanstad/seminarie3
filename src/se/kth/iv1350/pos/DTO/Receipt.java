package se.kth.iv1350.pos.DTO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import se.kth.iv1350.pos.DTO.ItemDTO;
import se.kth.iv1350.pos.dbHandler.Printer;

/**
 * This class represent the receipt for a sale
 */
public class Receipt {
	
	private Printer printer;
	
	/**
	 * Creates a instance of the receipt
	 */
	public Receipt() {
		Printer printer = new Printer();
		this.printer = printer;
	}
	/**
	 * This method sends the receipt to the printer 
	 */
	public void printReceipt(ReceiptDTO receiptInfo) {
		printer.printReceipt(receiptInfo.toString());
	}
}
