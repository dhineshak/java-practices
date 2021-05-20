/** Copyright (c) DK Organisation to present.
All rights reserved.
ProductManagement project is used to manage the product. 
*/
/**
 * 
 */
package practice.pm.data;

import java.io.Serializable;

/**
 * @author Dhinesh
 *
 */
public class Review implements Comparable<Review>, Serializable{

	private Rating rating;
	private String comments;
	/**
	 * @param rating
	 * @param comments
	 */
	public Review(Rating rating, String comments) {
		this.rating = rating;
		this.comments = comments;
	}
	public Rating getRating() {
		return rating;
	}
	public String getComments() {
		return comments;
	}
	@Override
	public String toString() {
		return "Rating=" + rating + ", comments=" + comments;
	}
	@Override
	public int compareTo(Review other) {
		return other.getRating().ordinal() - this.rating.ordinal();
	}
	
}
