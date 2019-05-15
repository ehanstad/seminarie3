package se.kth.iv1350.pos.DTO;

import java.util.Date;
import java.util.List;

/**
 *	Contains information regarding the receipt
 */
public class ReceiptDTO {
	
	private List<ItemDTO> itemList;
	private String storeName;
	private String storeAdress;
	private Date date;
	private double totalPrice;
	private double amountPaid;
	private double change;
	private double totalVAT;
	
	public ReceiptDTO(List<ItemDTO> itemList,String storeName,String storeAdress,Date date,double totalPrice, double amountPaid, double change, double totalVAT){
		this.itemList = itemList;
		this.storeName = storeName;
		this.storeAdress = storeAdress;
		this.date = date;
		this.totalPrice = totalPrice;
		this.amountPaid = amountPaid;
		this.change = change;
		this.totalVAT = totalVAT;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n" +"*****************************" + "\n");
		for (int i = 0; i < itemList.size(); i++) {
			sb.append(itemList.get(i) + "\n");
		}
		sb.append(storeName + "\n");
		sb.append("Adress: " + storeAdress + "\n");
		sb.append(date + "\n");
		sb.append("Totalpris: " + totalPrice + "\n");
		sb.append("MomsPris: " + totalVAT + "\n");
		sb.append("Motaget kontant: " + amountPaid + "\n");
		sb.append("Tillbaka: " + change + "\n");
		sb.append("*****************************" + "\n");
		return sb.toString();
	}
}
