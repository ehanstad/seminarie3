package se.kth.iv1350.pos.dbHandler;

import se.kth.iv1350.pos.DTO.ItemDTO;
import se.kth.iv1350.pos.exceptionHandler.InvalidIdentifierException;
import se.kth.iv1350.pos.exceptionHandler.ItemRegistryException;

/**
 * This program has no database, instead this class is a placeholder 
 * for the database connected to the item identification
 */
public class ItemRegistry {
	
	ItemDTO[] itemsToSell = {	new ItemDTO("Tomat", 10, 1.06, 1,  1),
								new ItemDTO("Äpple", 10, 1.12, 1, 2),
								new ItemDTO("Lime", 10, 1.25, 1, 3)};
	
	public static final int HARDCODED_EXCEPTION_IDENTIFIER = 7;
	
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
	 * @throws InvalidIdentifierException If the ID could not be found
	 * in the registry.
	 */
	public ItemDTO getItemSpecifications(int itemIdentifier) 
			throws InvalidIdentifierException, ItemRegistryException {
		ItemDTO item = null;
		int i = 0;
		while(itemsToSell.length > i) {
			if(itemsToSell[i].getItemIdentifier() == itemIdentifier)
				item = itemsToSell[itemIdentifier-1];
			i++;
		}
		if(item == null && itemIdentifier != HARDCODED_EXCEPTION_IDENTIFIER) {
			throw new InvalidIdentifierException(itemIdentifier + " är ett ogiltigt ID.");
		}
		if(itemIdentifier == HARDCODED_EXCEPTION_IDENTIFIER)
			throw new ItemRegistryException("Misslycakde att ansluta till databasen");
		
		return item;
	}
}
