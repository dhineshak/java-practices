package com.round.three;

import java.util.ArrayList;
import java.util.Arrays;

public class Order {
	public static int orderIdKeeper = 1000;
	private int orderId ;
	private int TotalPrice;
	private ArrayList<String> itemName = new ArrayList<String>() ;
	private ArrayList<Integer> price = new ArrayList<Integer>() ;
	
	public static int generateOrderId() {
		return orderIdKeeper++;
	}
	
	public Order( int totalPrice, ArrayList<String> itemName, ArrayList<Integer> price) {
		orderId = generateOrderId();
		TotalPrice = totalPrice;
		this.itemName = itemName;
		this.price = price;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getTotalPrice() {
		return TotalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		TotalPrice = totalPrice;
	}

	public ArrayList<String> getItemName() {
		return itemName;
	}

	public void setItemName(ArrayList<String> itemName) {
		this.itemName = itemName;
	}

	public ArrayList<Integer> getPrice() {
		return price;
	}

	public void setPrice(ArrayList<Integer> price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", TotalPrice=" + TotalPrice + ", itemName=" + itemName + ", price="
				+ price + "]";
	}
	
}
