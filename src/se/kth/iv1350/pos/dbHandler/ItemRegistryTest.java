package se.kth.iv1350.pos.dbHandler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import se.kth.iv1350.pos.DTO.ItemDTO;
import se.kth.iv1350.pos.dbHandler.ItemRegistry;
import se.kth.iv1350.pos.exceptionHandler.InvalidIdentifierException;
import se.kth.iv1350.pos.exceptionHandler.ItemRegistryException;

class ItemRegistryTest {
	
	ItemRegistry itemRe = new ItemRegistry();
	ItemDTO testItem = new ItemDTO("Äpple", 10, 1.12, 1, 2);
	
	@Test
	void testItemRegistryValidItemIdentifier() {
		String outputName;
		try {
			outputName = itemRe.getItemSpecifications(2).getItemName();
			double outputPrice = itemRe.getItemSpecifications(2).getItemPrice();
			double outputVAT = itemRe.getItemSpecifications(2).getVAT();
			double outputID = itemRe.getItemSpecifications(2).getItemIdentifier();
			assertEquals("Äpple", outputName);
			assertEquals(10, outputPrice);
			assertEquals(1.12, outputVAT);
			assertEquals(2, outputID);
		} catch (ItemRegistryException | InvalidIdentifierException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void testExceptionTest() {
		String outputName;
		try {
			double outputID = itemRe.getItemSpecifications(7).getItemIdentifier();
			fail( "My method didn't throw when I expected it to" );
		} catch (ItemRegistryException | InvalidIdentifierException e) {
		}
	}
}
