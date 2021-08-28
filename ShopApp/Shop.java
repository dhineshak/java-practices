package com.round.three;

import java.util.ArrayList;

public class Shop {
	static Shop shop = new Shop();
	
	ArrayList<Account> accounts = new ArrayList<Account>();
	ArrayList<Item> items = new ArrayList<Item>();
	private String topSelling[] = new String[3];
	private String discountCoupon = "PROMO-10";
	private int discountValue = 10;
	
	public int getDiscountValue() {
		return discountValue;
	}

	public void setDiscountValue(int discountValue) {
		this.discountValue = discountValue;
	}

	public String getDiscountCoupon() {
		return discountCoupon;
	}

	public void setDiscountCoupon(String discountCoupon) {
		this.discountCoupon = discountCoupon;
	}

	public String[] getTopSelling() {
		return topSelling;
	}

	public void setTopSelling(String[] topSelling) {
		this.topSelling = topSelling;
	}
	public ArrayList<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}
	public ArrayList<Item> getItems() {
		return items;
	}
	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	
	private static void preloadingAccountData() {
		Account accountOne = new Account(100,"admin",encryptPassword("admin123"),"admin");
		Account accountTwo = new Account(101,"kaushik",encryptPassword("kaushik123"),"customer");
		Account accountThree = new Account(102,"vignesh",encryptPassword("vignesh123"),"customer");
		ArrayList<Account> accountList = shop.getAccounts();
		accountList.add(accountOne);
		accountList.add(accountTwo);
		accountList.add(accountThree);
		shop.setAccounts(accountList);
	}
	
	private static void preloadingItemData() {
		Item ItemOne = new Item(100,"Good day","biscuit",90,10);
		Item ItemTwo = new Item(101,"Pantene","Conditioner",110,10);
		Item ItemThree = new Item(102,"Lux","Soap",25,10);
		Item ItemFour = new Item(103,"Dove","Soap",45,10);
		ArrayList<Item> itemList = shop.getItems();
		itemList.add(ItemOne);
		itemList.add(ItemTwo);
		itemList.add(ItemThree);
		itemList.add(ItemFour);
		shop.setItems(itemList);
	}
	
	private static String encryptPassword(String password) {
		StringBuilder encryptedPassword = new StringBuilder();
		for(int i = 0; i < password.length() ; i++) {
			if(password.charAt(i) == 'Z') {
				encryptedPassword.append("A");
			}else if(password.charAt(i) == 'z') {
				encryptedPassword.append("a");
			}else if(password.charAt(i) == '9') {
				encryptedPassword.append("0");
			}else {
				encryptedPassword.append((char)(password.charAt(i)+1));
			}
		}
		return encryptedPassword.toString();
	}
	
	public static String getEncryptPassword(String password) {
		return encryptPassword(password);
	}
	
	public static Shop getInstance() {
		return shop;
	}
	
	public static void loadData() {
		shop.preloadingAccountData();
		shop.preloadingItemData();
	}

}
