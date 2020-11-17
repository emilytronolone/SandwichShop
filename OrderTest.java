/**
 * JUnit testing for the Order class.
 * @author Devin Gulati, Emily Tronolone
 */
package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OrderTest {
	
	Order order = new Order();
	Sandwich chicken1 = new Chicken();
	Sandwich chicken2 = new Chicken();
	Sandwich chicken3 = new Chicken();
	Sandwich chicken4 = new Chicken();
	Sandwich beef1 = new Beef();
	Sandwich beef2 = new Beef();
	Sandwich beef3 = new Beef();
	Sandwich fish1 = new Fish();
	Sandwich fish2 = new Fish();
	Sandwich fish3 = new Fish();
	
	/**
	 * Test method for {@link application.Order#add(java.lang.Object)}.
	 */
	@Test
	void testAdd() {
		assertTrue(order.add(chicken1));
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link application.Order#remove(java.lang.Object)}.
	 */
	@Test
	void testRemove() {
		fail("Not yet implemented");
	}

}
