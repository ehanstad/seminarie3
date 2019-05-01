package se.kth.iv1350.pos.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import se.kth.iv1350.pos.DTO.ItemDTO;
import se.kth.iv1350.pos.DTO.Receipt;
import se.kth.iv1350.pos.DTO.ReceiptDTO;
import se.kth.iv1350.pos.dbHandler.InventoryRegistry;

/**
 * This class represents one specified sale
 */
public class Sale {

	private List<ItemDTO> itemList = new ArrayList<>();
	private InventoryRegistry inventoryRe;
	private Date date = new Date();
	
	/**
	 * Creates a new instance representing the Sale
	 */
	public Sale() {
		InventoryRegistry inventoryRe = new InventoryRegistry();
		this.inventoryRe = inventoryRe;
	}
	
	/**
	 * This method adds a specific item to the sale
	 * @param itemSpecifications The specific Item
	 */
	public void addItem(ItemDTO itemSpecifications) {
		this.itemList.add(itemSpecifications);
	}
	
	/**
	 * This method calculates the change
	 * @param cash The amount paid from customer
	 * @param totalPrice The total price for the Sale
	 * @return The change of the Sale
	 */
	public double calculateChange(double cash, double totalPrice) {
		double change = cash - totalPrice;
		if (change<0) {
			throw new IllegalArgumentException("Not enough money");
		}
		return change;
	}
	
	/**
	 * This method calculates the total price of the sale, and updates the 
	 * inventory system.
	 * @return The total price of the specific sale
	 */
	public double paymentInfo() {
		double totalPrice = calculateTotalPrice(this.itemList);
		inventoryRe.inventoryUpdate(this.itemList);
		return totalPrice;
	}
	
	private double calculateTotalPrice(List<ItemDTO> itemList) {
		double totalPrice = 0;
		
		for(int i=0; i<itemList.size(); i++) {
				totalPrice += itemList.get(i).getItemPrice()*itemList.get(i).getVAT()*itemList.get(i).getItemQuantity();
		}
		return totalPrice;
	}

	/**
	 * This method creates a ReceiptDTO object
	 * @param cash The amount paid by the customer
	 * @param totalPrice The total price of the Sale
	 * @param change The amount of money paid back to the customer
	 * @return All information needed for the receipt
	 */
	public ReceiptDTO createReceipt(double cash, double totalPrice, double change, double totalVAT) {
		ReceiptDTO receiptInfo = new ReceiptDTO(itemList, "The good food", "Sturegatan 33", date, totalPrice, cash, change, totalVAT);
		return receiptInfo;
	}

	/**
	 * This method calculates the total amount of money being VAT for the sale.
	 * @return 
	 */
	public double calculateTotalVAT(double totalPrice) {
		double totalVAT = 0;
		
		for(int i = 0; i<this.itemList.size(); i++) 
			totalVAT += itemList.get(i).getItemPrice();
		
		totalVAT = totalPrice - totalVAT;
		return totalVAT;
	}
}
