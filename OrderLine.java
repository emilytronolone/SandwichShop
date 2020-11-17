/**
 * This class creates serial numbers for each item added to an order.
 * @author Devin Gulati, Emily Tronolone
 */
package application;

public class OrderLine {
	public int lineNumber; //a serial number created when a sandwich is added to the order
	public Sandwich sandwich;
	public double price;

	/**
	OrderLine constructor.
	@param sandwich to add or remove from the order
	*/
	public OrderLine(Sandwich sandwich){
		this.sandwich = sandwich;
		this.price = sandwich.price();
	}

	/**
	Creates a string of the sandwich, its price, and any additional extras.
	@return String: sandwich, price, and extras
	*/
	@Override
	public String toString() {
		return sandwich.toString();
	}

	/**
	Setter method for lineNumber.
	@param int to set lineNumber to
	*/
	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}
}