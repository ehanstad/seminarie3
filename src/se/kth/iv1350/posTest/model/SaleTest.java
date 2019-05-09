package se.kth.iv1350.pos.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SaleTest {
	
	Sale sale = new Sale();
	
	@Test
	void testChange() {
		double output = sale.calculateChange(5, 3);
		assertEquals(2, output);
	}
	
	@Test
	void testChangeSameAmount() {
		double output = sale.calculateChange(5, 5);
		assertEquals(0, output);
	}
	
	@Test
	void testChangeNotEnoughCash() {
		try {
			sale.calculateChange(3, 4);
			fail( "My method didn't throw when I expected it to" );
		}
		catch(IllegalArgumentException e){
			
		}
	}
}
