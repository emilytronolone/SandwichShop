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
	
	OrderLine test1 = new OrderLine(chicken1);
	OrderLine test2 = new OrderLine(beef1);
	OrderLine test3 = new OrderLine(fish1);
	
	/**
	 * Test method for {@link application.Order#add(java.lang.Object)}.
	 */
	@Test
	void testAdd() {
		assertTrue(order.add(test1));
		assertTrue(order.add(test2));
		assertTrue(order.add(test3));
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link application.Order#remove(java.lang.Object)}.
	 */
	@Test
	void testRemove() {
		assertTrue(order.remove(test1));
		assertTrue(order.add(test2));
		assertTrue(order.add(test3));
		//fail("Not yet implemented");
	}

}
