package se.kth.iv1350.pos.model;

import java.util.ArrayList;
import se.kth.iv1350.pos.DTO.ItemDTO;
import se.kth.iv1350.pos.DTO.Receipt;
import se.kth.iv1350.pos.dbHandler.InventoryRegistry;

public class Sale {

	private ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();
	private InventoryRegistry inventoryRe;
	private Receipt receipt;
	
	public Sale() {
		InventoryRegistry inventoryRe = new InventoryRegistry();
		Receipt receipt = new Receipt();
	}
	
	public void addItem(ItemDTO itemSpecifications) {
		this.itemList.add(itemSpecifications);
	}
	
	public double paymentInfo() {
		double totalPrice = calculateTotalPrice(this.itemList);
		inventoryRe.inventoryUpdate(this.itemList);
		receipt.receiptUpdate(this.itemList);
		
		return totalPrice;
	}
	
	private double calculateTotalPrice(ArrayList<ItemDTO> itemList) {
		double totalPrice = itemList.get(0).getItemPrice();
		
		for(int i=1; i<itemList.size(); i++) 
			totalPrice += itemList.get(i).getItemPrice();
		
		return totalPrice;
	}
}
