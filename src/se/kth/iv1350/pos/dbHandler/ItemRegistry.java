package se.kth.iv1350.pos.dbHandler;

import se.kth.iv1350.pos.DTO.ItemDTO;

/**
 * This program has no database, instead this class is a placeholder 
 * for the database connected to the item identification
 */
public class ItemRegistry {
	
	ItemDTO[] itemsToSell = {	new ItemDTO("Tomat", 10, 1.06, 1,  1),
								new ItemDTO("Äpple", 10, 1.12, 1, 2),
								new ItemDTO("Lime", 10, 1.25, 1, 3)};
	
	/**
	 * Creates a new instance representing the item database
	 */
	public ItemRegistry() {
		
	}
	
	/**
	 * This method is a hard-coded placeholder representing the database
	 * @param itemIdentifier The ID for a specific item
	 * @param itemQuantity The number of items scanned at once
	 * @return The item specifications matched with the itemIdentifier
	 */
	public ItemDTO getItemSpecifications(int itemIdentifier) {
		ItemDTO item = itemsToSell[itemIdentifier-1];
		return item;
	}
	
	
}
