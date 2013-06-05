package by.bsu.ordermanagement.orderstate;


public class Granted extends OrderState {
	
	@Override
	public void addOrderLine(SalesOrder order) {
		order.setGranted();
	}
	
	@Override
	public void ship(SalesOrder order) {
		order.setShipped();
	}
	
	@Override
	public void cancel(SalesOrder order) {
		order.setCancelled();
	}
}
