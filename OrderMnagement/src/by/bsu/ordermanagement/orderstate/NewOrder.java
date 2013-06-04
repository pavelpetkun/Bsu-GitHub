package by.bsu.ordermanagement.orderstate;

import by.bsu.ordermanagement.salesorder.*;

public class NewOrder extends OrderState {
	
	@Override
	public void register(SalesOrder order) {
		order.setRegistered();
	}
	
	@Override
	public void cancel(SalesOrder order) {
		order.setCancelled();
	}
}