package by.bsu.ordermanagement.orderstate;



public class NewOrder extends OrderState {
	
	@Override
	public void addOrderLine(SalesOrder order) {
		order.setNewOrder();
	}
	
	@Override
	public void register(SalesOrder order) {
		order.setRegistered();
	}
	
	@Override
	public void cancel(SalesOrder order) {
		order.setCancelled();
	}
}