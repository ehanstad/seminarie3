package se.kth.iv1350.pos.dbHandler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import se.kth.iv1350.pos.DTO.ItemDTO;

class ItemRegistryTest {
	
	ItemRegistry itemRe = new ItemRegistry();
	ItemDTO testItem = new ItemDTO("Äpple", 10, 1.12, 1, 2);
	
	@Test
	void testItemRegistryValidItemIdentifier() {
		String outputName = itemRe.getItemSpecifications(2).getItemName();
		double outputPrice = itemRe.getItemSpecifications(2).getItemPrice();
		double outputVAT = itemRe.getItemSpecifications(2).getVAT();
		double outputID = itemRe.getItemSpecifications(2).getItemIdentifier();
		assertEquals("Äpple", outputName);
		assertEquals(10, outputPrice);
		assertEquals(1.12, outputVAT);
		assertEquals(2, outputID);
	}
	
}
