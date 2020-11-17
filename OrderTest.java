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
		//"Lettuce", "Tomato", "Bacon", "Onion", "Mushrooms", "Spinach", "American", "Swiss", "Avocado", "Mayonnaise"
		chicken2.add("Lettuce");
		OrderLine test7 = new OrderLine(chicken2);
		
		beef2.add("Swiss");
		OrderLine test8 = new OrderLine(beef2);
		
		fish2.add("Mushrooms");
		OrderLine test9 = new OrderLine(fish2);
		
		chicken3.add("Lettuce");
		chicken3.add("Tomato");
		chicken3.add("Bacon");
		OrderLine test10 = new OrderLine(chicken3);
		
		chicken4.add("Lettuce");
		chicken4.add("Tomato");
		chicken4.add("Bacon");
		chicken4.add("Onion");
		chicken4.add("Mushrooms");
		chicken4.add("Spinach");
		chicken4.add("American");
		chicken4.add("Swiss");
		chicken4.add("Avocado");
		chicken4.add("Mayonnaise");
		OrderLine test4 = new OrderLine(chicken4);
		
		beef3.add("Lettuce");
		beef3.add("Tomato");
		beef3.add("Bacon");
		beef3.add("Onion");
		beef3.add("Mushrooms");
		beef3.add("Spinach");
		beef3.add("American");
		beef3.add("Swiss");
		beef3.add("Avocado");
		beef3.add("Mayonnaise");
		OrderLine test5 = new OrderLine(beef3);
		
		fish3.add("Lettuce");
		fish3.add("Tomato");
		fish3.add("Bacon");
		fish3.add("Onion");
		fish3.add("Mushrooms");
		fish3.add("Spinach");
		fish3.add("American");
		fish3.add("Swiss");
		fish3.add("Avocado");
		fish3.add("Mayonnaise");
		OrderLine test6 = new OrderLine(fish3);
		
		assertTrue(order.add(test1));
		assertTrue(order.add(test2));
		assertTrue(order.add(test3));
		assertTrue(order.add(test4));
		assertTrue(order.add(test5));
		assertTrue(order.add(test6));
		assertTrue(order.add(test7));
		assertTrue(order.add(test8));
		assertTrue(order.add(test9));
		assertTrue(order.add(test10));
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link application.Order#remove(java.lang.Object)}.
	 */
	@Test
	void testRemove() {
		chicken2.add("Lettuce");
		OrderLine test7 = new OrderLine(chicken2);
		
		beef2.add("Swiss");
		OrderLine test8 = new OrderLine(beef2);
		
		fish2.add("Mushrooms");
		OrderLine test9 = new OrderLine(fish2);
		
		chicken3.add("Lettuce");
		chicken3.add("Tomato");
		chicken3.add("Bacon");
		OrderLine test10 = new OrderLine(chicken3);
		
		chicken4.add("Lettuce");
		chicken4.add("Tomato");
		chicken4.add("Bacon");
		chicken4.add("Onion");
		chicken4.add("Mushrooms");
		chicken4.add("Spinach");
		chicken4.add("American");
		chicken4.add("Swiss");
		chicken4.add("Avocado");
		chicken4.add("Mayonnaise");
		OrderLine test4 = new OrderLine(chicken4);
		
		beef3.add("Lettuce");
		beef3.add("Tomato");
		beef3.add("Bacon");
		beef3.add("Onion");
		beef3.add("Mushrooms");
		beef3.add("Spinach");
		beef3.add("American");
		beef3.add("Swiss");
		beef3.add("Avocado");
		beef3.add("Mayonnaise");
		OrderLine test5 = new OrderLine(beef3);
		
		fish3.add("Lettuce");
		fish3.add("Tomato");
		fish3.add("Bacon");
		fish3.add("Onion");
		fish3.add("Mushrooms");
		fish3.add("Spinach");
		fish3.add("American");
		fish3.add("Swiss");
		fish3.add("Avocado");
		fish3.add("Mayonnaise");
		OrderLine test6 = new OrderLine(fish3);
		
		assertTrue(order.add(test1));
		assertTrue(order.add(test2));
		assertTrue(order.add(test3));
		assertTrue(order.add(test4));
		assertTrue(order.add(test5));
		assertTrue(order.add(test6));
		assertTrue(order.add(test7));
		assertTrue(order.add(test8));
		assertTrue(order.add(test9));
		assertTrue(order.add(test10));
		//fail("Not yet implemented");
	}

}
