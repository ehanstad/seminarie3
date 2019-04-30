package se.kth.iv1350.pos.DTO;

/**
 * Contains information about one particular item
 */

public class ItemDTO {
	
	private String itemName;
	private double itemPrice;
	private double VAT;
	private int itemQuantity;
	private int itemIdentifier;
	
	/**
	 * Creates a new instance representing a particular item
	 * 
	 * @param itemName The name of the item
	 * @param itemPrice The price of the item
	 * @param VAT The tax for the item
	 * @param itemQuantity The number of items
	 * @param itemIdentifier The ID for the specific item
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
		return this.itemPrice*this.VAT;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(itemName + ", ");
		sb.append(itemPrice + " ");
		sb.append("moms " + (VAT-1)*100 + "% ");
		sb.append("antal " + itemQuantity);
		return sb.toString();
	}
}
