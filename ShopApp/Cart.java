package com.round.three;

import java.util.ArrayList;

public class Cart {

	private ArrayList<Integer> itemId = new ArrayList<Integer>() ;
	private int TotalPrice;
	private ArrayList<String> itemName = new ArrayList<String>() ;
	private ArrayList<Integer> price = new ArrayList<Integer>() ;
	
	
	public ArrayList<Integer> getItemId() {
		return itemId;
	}


	public void setItemId(int newitemId) {
		itemId.add(newitemId);
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


	public void setItemName(String newitemName) {
		itemName.add(newitemName);
	}


	public ArrayList<Integer> getPrice() {
		return price;
	}


	public void setPrice(int newprice) {
		price.add(newprice);
	}


	@Override
	public String toString() {
		return "Cart [itemId=" + itemId + ", TotalPrice=" + TotalPrice + ", itemName=" + itemName + ", price=" + price
				+ "]";
	}
	
	
}
