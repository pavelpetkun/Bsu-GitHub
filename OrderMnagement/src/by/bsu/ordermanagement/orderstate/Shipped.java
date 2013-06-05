package by.bsu.ordermanagement.orderstate;


public class Shipped extends OrderState {
	
	@Override
	public void invoice(SalesOrder order) {
		order.setInvoiced();
	}
}
