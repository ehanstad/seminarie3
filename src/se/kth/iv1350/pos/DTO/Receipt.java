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
	
	private List<ItemDTO> itemListReceipt;
	private String storeName = "The good food";
	private String storeAdress = "Sturegatan 33";
	private Date date = new Date();
	private double totalPriceReceipt;
	private double amountPaid;
	private double changeReceipt;
	private Printer printer;
	
	/**
	 * Creates a instance of the receipt
	 */
	public Receipt() {
		Printer printer = new Printer();
		this.printer = printer;
	}
	
	/**
	 * Gets the items in a list and saves them
	 * @param itemList The list of item in a specific sale
	 * @param totalPrice The total price of the sale
	 * @param change The amount of money paid of the customer
	 * @param cash The amount paid back to the customer
	 */
	public void receiptUpdate(List<ItemDTO> itemList, double totalPrice, double change, double cash) {
		itemListReceipt = itemList;
		totalPriceReceipt = totalPrice;
		changeReceipt = change;
		amountPaid = cash;
	}

	/**
	 * This method creates a <code>ReceiptDTO</code> and sends it to the printer 
	 */
	public void printReceipt() {
		
		ReceiptDTO receiptDTO = new ReceiptDTO(itemListReceipt, storeName, storeAdress, date, totalPriceReceipt, amountPaid, changeReceipt);
		printer.printReceipt(receiptDTO.toString());
	}
}
