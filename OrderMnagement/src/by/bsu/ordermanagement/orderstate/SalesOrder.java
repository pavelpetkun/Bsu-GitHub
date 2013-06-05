package by.bsu.ordermanagement.orderstate;

public class SalesOrder {
	private static OrderState newOrder = new NewOrder();
	private static OrderState registered = new Registered();
	private static OrderState granted = new Granted();
	private static OrderState shipped = new Shipped();
	private static OrderState invoiced = new Invoiced();
	private static OrderState cancelled = new Cancelled();
	
	private OrderState orderState = newOrder;
	
	public void setNewOrder() {
		orderState = newOrder;
	}
	
	public void setRegistered() {
		orderState = registered;
	}
	
	public void setGranted() {
		orderState = granted;
	}
	
	public void setShipped() {
		orderState = shipped;
	}
	
	public void setInvoiced() {
		orderState = invoiced;
	}
	
	public void setCancelled() {
		orderState = cancelled;
	}
	
	protected void wrongCommand() {
		System.out.print("Wrong command: ");
	}
	
	
	public void addOrderLine() {
		orderState.addOrderLine(this);
		System.out.println("addOrderLine");
	}
	
	public void register() {
		orderState.register(this);
		System.out.println("register");
	}
	
	public void grant() {
		orderState.grant(this);
		System.out.println("grant");
	}
	
	public void ship() {
		orderState.ship(this);
		System.out.println("ship");
	}
	
	public void invoice() {
		orderState.invoice(this);
		System.out.println("invoice");
	}
	
	public void cancel() {
		orderState.cancel(this);
		System.out.println("cancel");
	}
	
}
