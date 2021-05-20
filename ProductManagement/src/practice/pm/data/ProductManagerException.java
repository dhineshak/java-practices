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
public class ProductManagerException extends Exception{

	ProductManagerException(){

	}
	
	ProductManagerException(String message){
		super(message);
	}
	
	ProductManagerException(String message,Throwable cause){
		super(message,cause);
	}
}
