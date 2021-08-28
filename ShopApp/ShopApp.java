package com.round.three;

import java.util.ArrayList;
import java.util.Scanner;

public class ShopApp {
	static Scanner scan = new Scanner(System.in);
	static Shop shop = Shop.getInstance();
	
	public static void login() {
		boolean validFlag = false;
		do {
			System.out.println("Enter customerId");
			int customerId = ShopApp.scan.nextInt();
			System.out.println("Enter password");
			String password = ShopApp.scan.next();
			String encryptedPassword = Shop.getEncryptPassword(password);
			ArrayList<Account> accountList = shop.getAccounts();
			for(int i = 0 ; i < accountList.size() ; i++) {
				if(customerId == accountList.get(i).getCustomerId() && encryptedPassword.equals(accountList.get(i).getPassword())) {
					validFlag = true;
					String role = accountList.get(i).getRole();
					switch(role) {
					case "admin":
						ShopApp.adminMenu();
						break;
					case "customer":
						ShopApp.customerMenu(accountList.get(i));
						break;
					}
				}
			}
			if(!validFlag) {
				System.out.println("Invalid Username or Password.Try again");
			}
		}while(!validFlag);
	}
	
	public static void adminMenu() {
		int option = 0;
		do {
			System.out.println("Press corresponding number");
			System.out.println("1.Update Item");
			System.out.println("2.Top selling Items");
			System.out.println("3.Add new customer");
			System.out.println("0.Logout");
			option = ShopApp.scan.nextInt();
			switch(option) {
				case 1:
					ShopApp.updateItem();
					break;
				case 2:
					ShopApp.topSellingItems();
					break;
				case 3:
					ShopApp.addNewCustomer();
					break;	
				case 0:
					System.out.println("Successfully signed out");
					break;
			}
		}while(option != 0);
	}
	
	public static void customerMenu(Account account) {
		int option = 0;
		do {
			System.out.println("Press corresponding number");
			System.out.println("1.Place order");
			System.out.println("2.View Order History");
			System.out.println("0.Logout");
			option = ShopApp.scan.nextInt();
			switch(option) {
				case 1:
					ShopApp.placeOrder(account);
					break;
				case 2:
					ShopApp.ViewOrderHistory(account);
					break;
				case 0:
					System.out.println("Successfully signed out");
					break;
			}
		}while(option != 0);
	}
	
	public static void placeOrder(Account account) {
		int option = 0;
		boolean valid = false;
		Cart cart = new Cart();
		ArrayList<Item> itemList = shop.getItems();
		do {
			for(int i = 0; i <itemList.size();i++) {
				System.out.println(itemList.get(i));
			}
			System.out.println("Enter corresponding item id to add to cart");
			int id = ShopApp.scan.nextInt();
			int position = checkValidItemId(id);
			if(position != -1) {
				System.out.println("Enter quantity");
				int qty = ShopApp.scan.nextInt();
				if(itemList.get(position).getQuantityAvailable() >= qty) {
					valid = true;
					cart.setItemId(id);
					cart.setItemName(itemList.get(position).getItemName());
					if(!(itemList.get(position).getDiscountCoupon().equals(""))) {
						float disprice = (itemList.get(position).getPricePerUnit()*qty)-((itemList.get(position).getPricePerUnit()*qty)/100f)*itemList.get(position).getDiscountValue();
						cart.setPrice((int)disprice);
						cart.setTotalPrice(cart.getTotalPrice()+(int)disprice);
					}else {
						cart.setPrice(itemList.get(position).getPricePerUnit()*qty);
						cart.setTotalPrice(cart.getTotalPrice()+itemList.get(position).getPricePerUnit()*qty);
					}
					System.out.println(" Item Added");
					System.out.println("If you want to add more item.");
					System.out.println("Press 1 else 2 to proceed billing");
					option = ShopApp.scan.nextInt();
					if(option == 2) {
						ShopApp.billing(account,cart);
					}else{
						valid = false;
					}
				}else {
					System.out.println("Enter available quantity");
				}
			}else {
				System.out.println("Enter Valid item id");
				
			}
			
		}while(option!=0 && !valid);
	}
	
	public static void billing(Account account,Cart cart) {
		System.out.println("Total price : "+cart.getTotalPrice());
		boolean valid = false;
		do {
			System.out.println("Do you have any coupouns");
			System.out.println("If you have enter coupon. else enter 0");
			String coupon = ShopApp.scan.next();
			if(coupon.equals(shop.getDiscountCoupon())) {
				float disprice = (cart.getTotalPrice())-((float)cart.getTotalPrice()/100f)*shop.getDiscountValue();
				cart.setTotalPrice((int)disprice);
				Order order = new Order(cart.getTotalPrice(),cart.getItemName(),cart.getPrice());
				account.setOrder(order);
				System.out.println("Order placed");
				System.out.println("Total amount spent: "+ disprice);
				System.out.println("Thank you for ordering in Zohocart");
				valid = true;
			}else if(coupon.equals("0")){
				Order order = new Order(cart.getTotalPrice(),cart.getItemName(),cart.getPrice());
				account.setOrder(order);
				System.out.println("Order placed");
				System.out.println("Total amount spent: "+ cart.getTotalPrice());
				System.out.println("Thank you for ordering in Zohocart");
				valid = true;
			}else {
				System.out.println("Enter Valid Coupon");
			}
		}while(!valid);
	}
	
	public static int checkValidItemId(int id) {
		ArrayList<Item> itemsList = shop.getItems();
		for(int i = 0 ; i < itemsList.size() ; i++) {
			if(id == itemsList.get(i).getItemId()) {
				return i;
			}
		}
		return -1;
	}
	
	public static void ViewOrderHistory(Account account) {
		if(account.getOrder().size() == 0) {
			System.out.println("No order History Found");
		}else {
			System.out.println(account.getOrder());
		}
	}
	
	public static void addNewCustomer() {
		ArrayList<Account> accountList = shop.getAccounts();
		boolean validFlag = false;
		int cusId = accountList.get(accountList.size()-1).getCustomerId();
		cusId++;
		System.out.println("Enter username");
		String name = ShopApp.scan.next();
		do {	
			System.out.println("Enter password");
			String password = ShopApp.scan.next();
			System.out.println("Re-Enter password");
			String retypePassword = ShopApp.scan.next();
			if(password.equals(retypePassword)){
				validFlag = true;
				Account newAccount = new Account(cusId,name,Shop.getEncryptPassword(password),"customer");
				accountList.add(newAccount);
				shop.setAccounts(accountList);
			}else {
				System.out.println("Password does not match.");
			}
		}while(!validFlag);
	}
	
	public static void updateItem() {
		boolean validItem = false;
		int itemId;
		ArrayList<Item> itemList = shop.getItems();
		int position = 0;
		do {
			System.out.println("Enter Item ID or 0. to cancel");
			itemId = ShopApp.scan.nextInt();
			for(int i = 0 ; i< itemList.size();i++) {
				if(itemId == itemList.get(i).getItemId()) {
					validItem = true;
					position = i;
					break;
				}
			}
			if(!validItem && itemId != 0) {
				System.out.println("There is no item matches your Item ID.");
			}
			if(validItem) {
				System.out.println("Enter new Quantity");
				int newQty = ShopApp.scan.nextInt();
				System.out.println("Enter new Price");
				int newPrice = ShopApp.scan.nextInt();
				itemList.get(position).setPricePerUnit(newPrice);
				itemList.get(position).setQuantityAvailable(newQty);
				System.out.println("Updated");
				System.out.println(itemList.get(position));
			}
		}while(!validItem && itemId != 0);
		
	}
	
	public static void topSellingItems() {
		String topSelling[] = shop.getTopSelling();
		for(int i = 0; i < topSelling.length;i++) {			
		}
	}
	
	public static void main(String[] args) {
		Shop.loadData();
		System.out.println("Welcome to Zohocart!");
		int option = 0;
		do {
			System.out.println("Enter corresponding number");
			System.out.println("1.Login");
			System.out.println("2.Exit");
			option = ShopApp.scan.nextInt(); 
			if(option != 1 && option != 2) {
				System.out.println("Enter valid number");
			}
			switch(option) {
			case 1:
				ShopApp.login();
				break;
			case 2:
				System.out.println("Thank you for using ShopApp");
				break;
			}
		}while(option != 2);
	}

}
