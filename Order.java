/**
 * This class creates a new order.
 * You can add and remove from an order.
 * @author Devin Gulati, Emily Tronolone
 */
package application;

import java.util.ArrayList;

public class Order implements Customizable {
	public static int lineNumber; //reset for each new order;
	public ArrayList<OrderLine> orderlines = new ArrayList<OrderLine>();
	
	/**
	Adds a sandwich to an order.
	@param sandwich to be added
	@return true on success
	*/
	@Override
	public boolean add(Object obj) {
		// TODO Auto-generated method stub
		OrderLine order = (OrderLine) obj;
		order.setLineNumber(orderlines.size());
		orderlines.add(order);
		return true;
	}
	
	/**
	Removes a sandwich from an order.
	@param sandwich to be removed
	@return true on success
	*/
	@Override
	public boolean remove(Object obj) {
		// TODO Auto-generated method stub
		orderlines.remove(obj);
		return true;
	}
}