package bsu.gof.factory;

public class PCCreator extends Creator {

	public Computer factoryMethod() {
		Computer comp = new PCComputer();
		comp.setCpu(new PCCpu());
		comp.setMotherboard(new PCMotherboard());
		comp.setRom(new PCRom());
		
		return comp;
	}
}
