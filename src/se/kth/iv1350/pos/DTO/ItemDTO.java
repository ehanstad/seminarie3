package se.kth.iv1350.pos.DTO;

/**
 * This class 
 */

public class ItemDTO {
	
	private String itemName;
	private double itemPrice;
	private float VAT;
	private int itemQuantity;
	private int itemIdentifier;
	
	/**
	 * @param itemName
	 * @param itemPrice
	 * @param VAT
	 * @param itemQuantity
	 * @param itemIdentifier
	 */
	public ItemDTO(String itemName, double itemPrice, float VAT, int itemQuantity, int itemIdentifier) {
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.VAT = VAT;
		this.itemQuantity = itemQuantity;
		this.itemIdentifier = itemIdentifier;
	}
}
