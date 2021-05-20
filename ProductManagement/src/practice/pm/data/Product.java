/** Copyright (c) DK Organisation to present.
All rights reserved.
ProductManagement project is used to manage the product.
*/
package practice.pm.data;

import static java.math.RoundingMode.HALF_UP;
import static practice.pm.data.Rating.NOT_RATED;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Product class represents an application that manages the product.
 * version 1.0
 * @author Dhinesh
 */
public abstract class Product implements Rateable<Product>, Serializable{

	private static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);
	private int id;
	private String name;
	private BigDecimal price;
	private Rating rating;
	
	Product(){
		this(0,"Empty",BigDecimal.ZERO);
	}
	
	/**
	 * @param id
	 * @param name
	 * @param price
	 * @param rating
	 */
	Product(int id, String name, BigDecimal price, Rating rating) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.rating = rating;
	}
	

	Product(int id, String name, BigDecimal price) {
		this(id,name,price,NOT_RATED);
	}
	
	@Override
	public Rating getRating() {
		return rating;
	}

	public int getId() {
		return id;
	}

	//setter methods are commented to make this class immutable
//	public void setId(final int id) {
//		this.id = id;
//	}

	public String getName() {
		return name;
	}

//	public void setName(final String name) {
//		this.name = name;
//	}

	public BigDecimal getPrice() {
		return price;
	}

//	public void setPrice(final BigDecimal price) {
////		price = BigDecimal.ONE;		final is used to avoid manipulating the value in the complex code.
//		this.price = price;
//	}
	
//	public void setPrice(final double price) {
//		this.price = BigDecimal.valueOf(price);
//	}
	
//	public void setPrice(final BigDecimal price, final BigDecimal discount) {
//		this.price = price.multiply(discount);
//	}

	/*
	 * getDiscount method is used to get discount rate of an product.
	 * @return (@link java.Math.BigDecimal BigDecimal)
	 */
	public BigDecimal getDiscount() {
		return price.multiply(DISCOUNT_RATE).setScale(2, HALF_UP);
	}
	
//	public abstract Product applyRating(Rating newRating) ;
	
	public LocalDate getBestBefore() {
		return LocalDate.now();
	}
	
	@Override
	public int hashCode() {
		int hashCode = 7;
		return hashCode * 29 * this.id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj != null && obj instanceof Product) {
			Product other = (Product)obj;
			return (this.id == other.id);
		}
		return false;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", price=" + price + ", rating=" + this.getBestBefore() + rating.getStars();
	}
}
