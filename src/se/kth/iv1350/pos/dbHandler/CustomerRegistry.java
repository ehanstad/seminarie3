package se.kth.iv1350.pos.dbHandler;

/**
 * This program has no database, instead this class is a placeholder 
 * for the database connected to the customer identification
 */
public class CustomerRegistry {
	
	/**
	 * Creates a new instance representing the customer database
	 */
	public CustomerRegistry() {
		
	}

	/**
	 * This is a hardcoded method witch gets the customers discount on a 
	 * sale
	 * @param customerID Unique customer identification
	 * @return The discount value
	 */
	public float getDiscount(int customerID) {		
		return (float) 0.15;
	}
}
