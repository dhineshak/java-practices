/** Copyright (c) DK Organisation to present.
All rights reserved.
ProductManagement project is used to manage the product. 
*/
/**
 * 
 */
package practice.pm.data;

/**
 * @author Dhinesh
 *
 */
public enum Rating {
	NOT_RATED("\u2606\u2606\u2606\u2606\u2606"),
	ONE_STAR("\u2605\u2606\u2606\u2606\u2606"),
	TWO_STAR("\u2605\u2605\u2606\u2606\u2606"),
	THREE_STAR("\u2605\u2605\u2605\u2606\u2606"),
	FOUR_STAR("\u2605\u2605\u2605\u2605\u2606"),
	FIVE_STAR("\u2605\u2605\u2605\u2605\u2605");
	private String stars;
	private Rating(final String stars){
		this.stars = stars;
	}
	public String getStars() {
		return stars;
	}
}
