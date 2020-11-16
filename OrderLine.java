
/**
 * 
 */
//package application;

public class OrderLine {
	public int lineNumber; //a serial number created when a sandwich is added to the order
	public Sandwich sandwich;
	public double price;

	public OrderLine(Sandwich sandwich){
		this.sandwich = sandwich;
		this.price = sandwich.price();
	}

	@Override
	public String toString() {
		return sandwich.toString();
	}
}