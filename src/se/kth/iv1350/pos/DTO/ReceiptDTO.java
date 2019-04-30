package se.kth.iv1350.pos.DTO;

import java.util.ArrayList;
import java.util.Date;

/**
 *	Contains information regarding the receipt
 */
public class ReceiptDTO {
	
	private ArrayList<ItemDTO> itemList;
	private String storeName;
	private String storeAdress;
	private Date date;
	private double totalPrice;
	private double amountPaid;
	private double change;
	
	public ReceiptDTO(ArrayList<ItemDTO> itemList,String storeName,String storeAdress,Date date,double totalPrice, double amountPaid, double change){
		this.itemList = itemList;
		this.storeName = storeName;
		this.storeAdress = storeAdress;
		this.date = date;
		this.totalPrice = totalPrice;
		this.amountPaid = amountPaid;
		this.change = change;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(itemList + ",\n");
		sb.append(storeName + "\n");
		sb.append("Adress: " + storeAdress + "\n");
		sb.append(date + "\n");
		sb.append("Totalpris: " + totalPrice + "\n");
		sb.append("Motaget kontant: " + amountPaid + "\n");
		sb.append("Tillbaka: " + change);
		return sb.toString();
	}
}
