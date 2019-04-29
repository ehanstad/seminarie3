package se.kth.iv1350.pos.DTO;

import java.util.ArrayList;
import java.util.Date;

public class ReceiptDTO {
	
	private ArrayList<ItemDTO> itemList;
	private String storeName;
	private Date date;
	private double totalPrice;
	private double amountPaid;
	private double change;
	
	public ReceiptDTO(ArrayList<ItemDTO> itemList,String storeName,Date date,double totalPrice, double amountPaid, double change){
		this.itemList = itemList;
		this.storeName = storeName;
		this.date = date;
		this.totalPrice = totalPrice;
		this.amountPaid = amountPaid;
		this.change = change;
	}
}
