package com.round.three;

public class Item {
	private int itemId;
	private String itemName;
	private String category;
	private int pricePerUnit;
	private int quantityAvailable;
	private String discountCoupon = "";
	private int discountValue ;
	
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

	public Item(int itemId, String itemName, String category, int pricePerUnit, int quantityAvailable) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.category = category;
		this.pricePerUnit = pricePerUnit;
		this.quantityAvailable = quantityAvailable;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(int pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public int getQuantityAvailable() {
		return quantityAvailable;
	}

	public void setQuantityAvailable(int quantityAvailable) {
		this.quantityAvailable = quantityAvailable;
	}

	@Override
	public String toString() {
		return "itemId=" + itemId + "\nitemName=" + itemName + ", category=" + category + "\n pricePerUnit="
				+ pricePerUnit + ", quantityAvailable=" + quantityAvailable;
	}
	
}
