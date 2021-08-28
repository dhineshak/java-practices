package com.round.three;

import java.util.ArrayList;

public class Account {
	private int customerId;
	private String userName;
	private String password;
	private String role;
	private ArrayList<Order> order = new ArrayList<Order>();
	
	public ArrayList<Order> getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order.add(order);
	}

	public Account(int customerId, String userName, String password, String role) {
		this.customerId = customerId;
		this.userName = userName;
		this.password = password;
		this.role = role;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Account [customerId=" + customerId + ", userName=" + userName + ", role=" + role + "]";
	}

}
