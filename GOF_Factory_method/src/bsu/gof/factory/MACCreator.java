package bsu.gof.factory;

public class MACCreator extends Creator {

	public Computer factoryMethod() {
		Computer comp = new MacComputer();
		comp.setCpu(new MacCpu());
		comp.setMotherboard(new MacMotherboard());
		comp.setRom(new MacROM());
		
		return comp;
	}
}
