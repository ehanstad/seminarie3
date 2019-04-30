package se.kth.iv1350.pos.dbHandler;

/**
 *	This class is responsible for instantiating all registers
 */
public class RegistryCreator {
	
	public RegistryCreator() {
		ItemRegistry itemRegistry = new ItemRegistry();
		CustomerRegistry customRegistry = new CustomerRegistry();
		new InventoryRegistry();
		new AccountingRegistry();
	}
}
