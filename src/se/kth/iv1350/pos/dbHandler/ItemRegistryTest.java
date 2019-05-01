package se.kth.iv1350.pos.dbHandler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import se.kth.iv1350.pos.DTO.ItemDTO;

class ItemRegistryTest {
	
	ItemRegistry itemRe = new ItemRegistry();
	ItemDTO testItem = new ItemDTO("Äpple", 10, 1.12, 1, 2);
	
	@Test
	void testItemRegistryValidItemIdentifier() {
		ItemDTO output = itemRe.getItemSpecifications(2);
		assertEquals(testItem, output);
	}

}
