package se.kth.iv1350.pos.dbHandler;

public class RegistryCreator {
	
	public RegistryCreator() {
		ItemRegistry itemRegistry = new ItemRegistry();
		CustomerRegistry customRegistry = new CustomerRegistry();
		new InventoryRegistry();
		new AccountingRegistry();
	}
}
