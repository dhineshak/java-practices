/** Copyright (c) DK Organisation to present.
All rights reserved.
ProductManagement project is used to manage the product. 
*/
/**
 * 
 */
package practice.pm.data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author Dhinesh
 *
 */
public class Food extends Product{
	LocalDate bestBefore ;

	/**
	 * @param id
	 * @param name
	 * @param price
	 * @param rating
	 */
	Food(int id, String name, BigDecimal price, Rating rating, LocalDate bestBefore) {
		super(id, name, price, rating);
		this.bestBefore = bestBefore;
	}

	public LocalDate getBestBefore() {
		return bestBefore;
	}

	@Override
	public BigDecimal getDiscount() {
		return this.bestBefore.equals(LocalDate.now()) ? super.getDiscount() : BigDecimal.ZERO;
	}
	
	public Product applyRating(Rating newRating){
		return new Food(this.getId(),this.getName(),this.getPrice(),newRating,bestBefore);
	}

	@Override
	public String toString() {
		return super.toString() + " " + "bestBefore=" + bestBefore;
	}
	
}
