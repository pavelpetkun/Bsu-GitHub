package bsu.gof.factory;

public class MACFactory extends ComputerFactory {
	public Computer createComputer() {
		return new MacComputer();
	}
	public Motherboard createMotheboard() {
		return new MacMotherboard();
	}
	public ROM createROM() {
		return new MacROM();
	}
	public CPU createCPU() {
		return new MacCpu();
	}
}
