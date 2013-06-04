package by.bsu.ordermanagement.orderstate;

import by.bsu.ordermanagement.salesorder.SalesOrder;

public class Shipped extends OrderState {
	
	@Override
	public void invoice(SalesOrder order) {
		order.setInvoiced();
	}
}
