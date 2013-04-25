package by.bsu.command.command;

import by.bsu.command.Order;
import by.bsu.command.ParameterObject;

public class CancelLastOrderCommand implements Command {

	private ParameterObject params;
	
	public void execute() {
		//MakeOrderLogic orderLogic = MakeOrderLogic.getInstance();
		params.restoreFromMemento();
		System.out.println(params.isRemoveOrder());
		Order order = params.getOrder();
		if (!params.isRemoveOrder()) {
			
			//remove order logic
			params.setRemoveOrder(true);
		}
	}

	public void setParams(ParameterObject params) {
		this.params = params;
	}
}
