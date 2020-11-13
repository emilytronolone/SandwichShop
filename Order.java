/**
 * @author Devin Gulati, Emily Tronolone
 */
package application;

import java.util.ArrayList;

public class Order implements Customizable {
	public static int lineNumber; //reset for each new order;
	private ArrayList<OrderLine> orderlines;
}