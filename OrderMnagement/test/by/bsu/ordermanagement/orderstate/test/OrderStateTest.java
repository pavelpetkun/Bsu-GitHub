package by.bsu.ordermanagement.orderstate.test;

import by.bsu.ordermanagement.orderstate.*;
import org.junit.Test;


public class OrderStateTest {
	
	@Test
	public void testOrderState() throws ClassNotFoundException,
	InstantiationException, IllegalAccessException {
		
		SalesOrder salesOrder = new SalesOrder();
		salesOrder.addOrderLine();
		salesOrder.register();
		salesOrder.invoice();
	}
}
