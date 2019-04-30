package se.kth.iv1350.pos.model;

import java.util.ArrayList;
import se.kth.iv1350.pos.DTO.ItemDTO;
import se.kth.iv1350.pos.DTO.Receipt;
import se.kth.iv1350.pos.dbHandler.InventoryRegistry;

/**
 * This class represents one specified sale
 */
public class Sale {

	private ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();
	private InventoryRegistry inventoryRe;
	private Receipt receipt;
	
	/**
	 * Creates a new instance representing the Sale
	 */
	public Sale() {
		InventoryRegistry inventoryRe = new InventoryRegistry();
		Receipt receipt = new Receipt();
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
		receipt.receiptUpdate(this.itemList,totalPrice, change, cash);
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
	
	private double calculateTotalPrice(ArrayList<ItemDTO> itemList) {
		double totalPrice = itemList.get(0).getItemPrice();
		
		for(int i=1; i<itemList.size(); i++) 
			totalPrice += itemList.get(i).getItemPrice();
		
		return totalPrice;
	}
}
