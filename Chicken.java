/**
 * This class creates an object for a chicken sandwich.
 * You can add/remove extras, get the price, and print as a string.
 * @author Devin Gulati, Emily Tronolone
 */
package application;

import java.util.ArrayList;

public class Chicken extends Sandwich {

	private ArrayList<String> extras = new ArrayList<String>();

	/**
	Adds an extra to the sandwich.
	@param extra to be added
	@return true if extra was added
	*/
	@Override
	public boolean add(Object obj) {
		// TODO Auto-generated method stub
		if(extras.size() == MAX_EXTRAS) return false;
		extras.add((String)obj);
		return true;
	}

	/**
	Removes an extra from the sandwich.
	@param extra to be removed
	@return false if extra was removed
	*/
	@Override
	public boolean remove(Object obj) {
		// TODO Auto-generated method stub
		extras.remove((String)obj);
		return true;
	}

	/**
	Returns the price of a chicken sandwich.
	@return double: price of the sandwich
	*/
	@Override
	public double price() {
		double price = 8.99;
		price += 1.99 * extras.size();
		price = (double)Math.round(price * 100d) / 100d;
		return price;
	}

	/**
	Creates a string of the chicken sandwich, its price, and any additional extras.
	@return String: sandwich, price, and extras
	*/
	@Override
	public String toString() {
		return "Chicken Sandwich : $"+ price() + " : Basic Ingredients - Fried Chicken, Spicy Sauce, Pickles : Extra Ingredients - " + extras.toString();
	}
}