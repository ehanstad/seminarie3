package se.kth.iv1350.pos.DTO;

/**
 * This class is a DTO to the class Item
 */

public class ItemDTO {
	
	private String itemName;
	private double itemPrice;
	private double VAT;
	private int itemQuantity;
	private int itemIdentifier;
	
	/**
	 * 
	 * @param itemName
	 * @param itemPrice
	 * @param VAT
	 * @param itemQuantity
	 * @param itemIdentifier
	 */
	public ItemDTO(String itemName, double itemPrice, double VAT, int itemQuantity, int itemIdentifier) {
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.VAT = VAT;
		this.itemQuantity = itemQuantity;
		this.itemIdentifier = itemIdentifier;
	}
	
	public String getItemName() {
		return this.itemName;
	}
	
	public double getItemPrice() {
		return this.itemPrice;
	}
}
