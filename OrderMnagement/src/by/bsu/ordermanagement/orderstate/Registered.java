package by.bsu.ordermanagement.orderstate;


public class Registered extends OrderState {

	@Override
	public void addOrderLine(SalesOrder order) {
		order.setRegistered();
	}
	
	@Override
	public void grant(SalesOrder order) {
		order.setGranted();
	}
	
	@Override
	public void cancel(SalesOrder order) {
		order.setCancelled();
	}
}
