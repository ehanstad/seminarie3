package se.kth.iv1350.pos.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DiscountTest {

	Discount discount = new Discount();
	
	@Test
	void testcalculateDiscountWithValidCustomerID() {
		double output = discount.calculateDiscount(1, 100);
		assertEquals(100*0.95, output);
	}
	
	@Test
	void testcalculateDiscountWithInvalidCustomerID() {
		double output = discount.calculateDiscount(2, 100);
		assertEquals(100, output);
	}
}
