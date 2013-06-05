package bsu.gof.factory;

public class SPARCFactory extends ComputerFactory {
	
	public Computer createComputer() {
		return new SPARCComputer();
	}
	public Motherboard createMotheboard() {
		return new SPARCMotherboard();
	}
	public ROM createROM() {
		return new SPARCROM();
	}
	public CPU createCPU() {
		return new SPARCCpu();
	}
}
