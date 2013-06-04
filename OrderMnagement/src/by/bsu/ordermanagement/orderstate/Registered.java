package by.bsu.ordermanagement.orderstate;

import by.bsu.ordermanagement.salesorder.SalesOrder;

public class Registered extends OrderState {

	@Override
	public void grant(SalesOrder order) {
		order.setGranted();
	}
	
	@Override
	public void cancel(SalesOrder order) {
		order.setCancelled();
	}
}
