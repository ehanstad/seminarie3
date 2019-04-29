package se.kth.iv1350.pos.dbHandler;

import se.kth.iv1350.pos.DTO.ItemDTO;

public class ItemRegistry {
	
	public ItemRegistry() {
		
	}
	
	public ItemDTO getItemSpecifications(int itemIdentifier, int itemQuantity) {
		
		ItemDTO item = new ItemDTO("Tomato", 23.5, 12.5, itemQuantity, itemIdentifier);
		
		return item;
	}
}
