package bsu.gof.factory;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFactory {

	@Test
	public void testMACComputer() {
		Creator creator = Creator.getInstance(ComputerType.MAC);
		Computer comp = creator.factoryMethod();
		/*Computer comp = factory.createComputer();
		comp.setCpu(factory.createCPU());
		comp.setMotherboard(factory.createMotherboard());
		comp.setRom(factory.createROM());*/

		assertTrue(comp.getType() == ComputerType.MAC);
	}
	
	@Test
	public void testPCComputer() {
		Creator creator = Creator.getInstance(ComputerType.PC);
		Computer comp = creator.factoryMethod();
		
		assertTrue(comp.getType() == ComputerType.PC);

	}
}
