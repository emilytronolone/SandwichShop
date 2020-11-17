/**
 * @author Devin Gulati, Emily Tronolone
 */
package application;

import java.util.ArrayList;

public class Order implements Customizable {
	public static int lineNumber; //reset for each new order;
	public ArrayList<OrderLine> orderlines = new ArrayList<OrderLine>();
	
	@Override
	public boolean add(Object obj) {
		// TODO Auto-generated method stub
		OrderLine order = (OrderLine) obj;
		order.setLineNumber(orderlines.size());
		orderlines.add(order);
		return true;
	}
	@Override
	public boolean remove(Object obj) {
		// TODO Auto-generated method stub
		orderlines.remove(obj);
		return true;
	}
}