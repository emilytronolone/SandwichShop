/**
 * This class creates an object for a new sandwich.
 * Its subclasses are Beef, Chicken, and Fish.
 * @author Devin Gulati, Emily Tronolone
 */
package application;

import java.util.ArrayList;

public abstract class Sandwich implements Customizable {
	static final int MAX_EXTRAS = 6;
	static final double PER_EXTRA = 1.99;
	protected ArrayList<Extra> extras;
	
	/**
	Abstract method implemented in its subclasses to return the price of a sandwich.
	@return double: price of sandwich
	*/
	public abstract double price();
	
	/**
	Method that will be overridden in its subclasses.
	@return String: sandwich, price, and extras
	*/
	public String toString() { return null; }
}