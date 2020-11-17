import java.util.ArrayList;

/**
 * 
 */
//package application;
<<<<<<< Updated upstream:Chicken.java
=======

import java.util.ArrayList;
>>>>>>> Stashed changes:src/Chicken.java

public class Chicken extends Sandwich {

	private ArrayList<String> extras = new ArrayList<String>();

	@Override
	public boolean add(Object obj) {
		// TODO Auto-generated method stub
		if(extras.size() == MAX_EXTRAS) return false;
		extras.add((String)obj);
		return true;
	}

	@Override
	public boolean remove(Object obj) {
		// TODO Auto-generated method stub
		extras.remove((String)obj);
		return true;
	}

	@Override
	public double price() {
		double price = 8.99;
		price += 1.99 * extras.size();
		price = (double)Math.round(price * 100d) / 100d;
		return price;
	}

	@Override
	public String toString() {
		return "Chicken Sandwich : $"+ price() + " : Basic Ingredients - Fried Chicken, Spicy Sauce, Pickles : Extra Ingredients - " + extras.toString();
	}
}