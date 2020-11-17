/**
 * @author Devin Gulati, Emily Tronolone
 */
package application;

import java.util.ArrayList;

public class Fish extends Sandwich {

	private ArrayList<String> extras = new ArrayList<String>();;

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
		return false;
	}

	@Override
	public double price() {
		double price = 12.99;
		price += 1.99 * extras.size();
		price = (double)Math.round(price * 100d) / 100d;
		return price;
	}

	@Override
	public String toString() {
		return "Fish Sandwich : $"+ price() + " : Basic Ingredients - Grilled Snapper, Cilantro, Lime : Extra Ingredients - " + extras.toString();
	}
}