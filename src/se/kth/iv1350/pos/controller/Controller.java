package se.kth.iv1350.pos.controller;

import se.kth.iv1350.pos.model.CashRegister;
import se.kth.iv1350.pos.model.Discount;
import se.kth.iv1350.pos.model.Sale;
import se.kth.iv1350.pos.DTO.ItemDTO;
import se.kth.iv1350.pos.DTO.Receipt;
import se.kth.iv1350.pos.DTO.ReceiptDTO;
import se.kth.iv1350.pos.dbHandler.ItemRegistry;
import se.kth.iv1350.pos.dbHandler.RegistryCreator;

/**
 * This class is the applications controller class. All
 * calls to the model pass through here
 */
public class Controller {
	private Sale sale;
	private ItemRegistry itemRe;
	private Discount discount;
	private CashRegister cashRe;
	private Receipt receipt;
	
	/**
	 * Creates a instance of the controller
	 */
	public Controller(RegistryCreator creator) {
		this.itemRe = creator.getItemRegistry();
		Discount discount = new Discount();
		this.discount = discount;
		CashRegister cashRe = new CashRegister();
		this.cashRe = cashRe;
		Receipt receipt = new Receipt();
		this.receipt = receipt;
	}
	
	/**
	 * Creates a new Sale
	 */
	public void startNewSale() {
		
		Sale sale = new Sale();
		this.sale = sale;
	}
	
	/**
	 * Adds a new item to the sale and checks if the item exists in the 
	 * database.
	 * 
	 * @param itemIdentifier 
	 * @param itemQuantity
	 * @return
	 */
	public void addItem(int itemIdentifier, int itemQuantity) {
		
		ItemDTO itemSpecifications = itemRe.getItemSpecifications(itemIdentifier);
		while(itemQuantity>1) {
			itemSpecifications.addSameItem();
			itemQuantity--;
		}
		sale.addItem(itemSpecifications);
	}
	
	/**
	 * Starts the payment 
	 * @return Total price of the sale before discount
	 */
	public double startPayment() {
		
		double totalPrice = sale.paymentInfo();
		return totalPrice;
	}
	
	/**
	 * This method checks if the customer has a discount and updates the 
	 * total price accordingly.
	 * @param customerID Unique ID for specific customer
	 * @param cash Amount of money paid from customer
	 */
	public double checksForDiscount(int customerID, double cash, double totalPriceBeforeDiscount) {
		
		double totalPrice = discount.calculateDiscount(customerID, totalPriceBeforeDiscount);
		cashRe.addPayment(totalPrice);
		double change = sale.calculateChange(cash, totalPrice);
		double totalVAT = sale.calculateTotalVAT(totalPrice);
		ReceiptDTO receiptInfo = sale.createReceipt(cash, totalPrice, change, totalVAT);
		receipt.printReceipt(receiptInfo);
		return change;
	}
}
