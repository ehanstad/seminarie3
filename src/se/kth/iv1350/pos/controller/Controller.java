package se.kth.iv1350.pos.controller;

import se.kth.iv1350.pos.model.CashRegister;
import se.kth.iv1350.pos.model.Discount;
import se.kth.iv1350.pos.model.Sale;
import se.kth.iv1350.pos.DTO.ItemDTO;
import se.kth.iv1350.pos.dbHandler.ItemRegistry;

public class Controller {
	private Sale sale;
	private ItemRegistry itemRe;
	private Discount discount;
	private CashRegister cashRe;
	
	public Controller() {
		
	}
	
	public void startNewSale() {
		
		Sale sale = new Sale();
		ItemRegistry itemRe = new ItemRegistry();
		Discount discount = new Discount();
		CashRegister cashRe = new CashRegister();
	}
	
	public String addItem(int itemIdentifier, int itemQuantity) {
		
		ItemDTO itemSpecifications = itemRe.getItemSpecifications(itemIdentifier, itemQuantity);
		
		if (itemSpecifications.getItemName() == null) {
			return "Item does not exist";
		}
		sale.addItem(itemSpecifications);
		return "Item added";
	}
	
	public double startPayment() {
		
		double totalPrice = sale.paymentInfo();
		return totalPrice;
	}
	
	public void checksForDiscount(int customerID,double cash) {
		
		double totalPrice = discount.calculateDiscount(customerID, sale.paymentInfo());
		double change = cashRe.addPayment(cash,totalPrice);
	}
}
