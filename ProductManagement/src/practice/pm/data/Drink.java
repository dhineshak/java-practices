/** Copyright (c) DK Organisation to present.
All rights reserved.
ProductManagement project is used to manage the product. 
*/
/**
 * 
 */
package practice.pm.data;

import java.math.BigDecimal;
import java.time.LocalTime;

/**
 * @author Dhinesh
 *
 */
public class Drink extends Product{

	/**
	 * @param id
	 * @param name
	 * @param price
	 * @param rating
	 */
	Drink(int id, String name, BigDecimal price, Rating rating) {
		super(id, name, price, rating);
	}
	
	@Override
	public BigDecimal getDiscount() {
		return LocalTime.now().isAfter(LocalTime.of(17,0)) && LocalTime.now().isBefore(LocalTime.of(20,30)) ? super.getDiscount() : BigDecimal.ZERO;
	}
	
	public Product applyRating(Rating newRating){
		return new Drink(this.getId(),this.getName(),this.getPrice(),newRating);
	}
	
}
