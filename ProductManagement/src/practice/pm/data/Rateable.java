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
@FunctionalInterface
public interface Rateable<T> {

	public static final Rating DEFAULT_RATING = Rating.NOT_RATED;
	
	T applyRating(Rating rating);
	
	public default T applyRating(int stars) {
		return applyRating(Rateable.convert(stars));
	}
	
	public default Rating getRating() {
		return DEFAULT_RATING;
	}
	
	public static Rating convert(int stars) {
		return (stars >= 0 && stars <= 5) ? Rating.values()[stars] : DEFAULT_RATING;
	}
}
