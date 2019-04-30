package se.kth.iv1350.pos.dbHandler;

/**
 *	This class is responsible for instantiating all registers
 */
public class RegistryCreator {
	
	private ItemRegistry itemRegistry = new ItemRegistry();
	private CustomerRegistry customRegistry = new CustomerRegistry();
	private InventoryRegistry invenRe = new InventoryRegistry();
	private AccountingRegistry accountRe = new AccountingRegistry();
	
	public ItemRegistry getItemRegistry() {
		return itemRegistry;
	}
	public CustomerRegistry getCustomerRegistry() {
		return customRegistry;
	}
	public InventoryRegistry getInventoryRegistry() {
		return invenRe;
	}
	public AccountingRegistry getAccountingRegistry() {
		return accountRe;
	}
}
