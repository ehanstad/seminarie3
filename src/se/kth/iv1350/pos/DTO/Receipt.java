package se.kth.iv1350.pos.DTO;

import java.util.ArrayList;
import java.util.Date;
import se.kth.iv1350.pos.DTO.ItemDTO;
import se.kth.iv1350.pos.dbHandler.Printer;

public class Receipt {
	
	private ArrayList<ItemDTO> itemListReceipt;
	private String storeName = "The good food";
	private Date date = new Date();
	private double totalPriceReceipt;
	private double amountPaid;
	private double changeReceipt;
	private Printer printer;
	
	public Receipt() {
		Printer printer = new Printer();
	}

	public void receiptUpdate(ArrayList<ItemDTO> itemList) {
		itemListReceipt = itemList;
	}

	public void addTotalPriceAndChange(double totalPrice, double change, double cash) {
		totalPriceReceipt = totalPrice;
		changeReceipt = change;
		amountPaid = cash;
		ReceiptDTO receiptDTO = new ReceiptDTO(itemListReceipt, storeName, date, totalPriceReceipt, amountPaid, changeReceipt);
		printer.printReceipt(receiptDTO.toString());
	}
}
