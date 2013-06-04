package by.bsu.ordermanagement.orderstate;

import by.bsu.ordermanagement.salesorder.SalesOrder;

public class Granted extends OrderState {
	@Override
	public void ship(SalesOrder order) {
		order.setShipped();
	}
	
	@Override
	public void cancel(SalesOrder order) {
		order.setCancelled();
	}
}
