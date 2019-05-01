package se.kth.iv1350.pos.dbHandler;

/**
 * This program has no database, instead this class is a placeholder 
 * for the database connected to the customer identification
 */
public class CustomerRegistry {
	
	private static final int VALID_CUSTOMERID = 1;
	
	/**
	 * Creates a new instance representing the customer database
	 */
	public CustomerRegistry() {
		
	}

	/**
	 * This is a hard-coded method witch gets the customers discount on a 
	 * sale
	 * @param customerID Unique customer identification
	 * @return The discount value
	 */
	public double getDiscount(int customerID) {		
		if(customerID == VALID_CUSTOMERID)
			return 0.95;
		else
			return 1;
	}
}
