package bsu.gof.factory;

import static org.junit.Assert.*;
import org.junit.Test;


public class TestFactory {
	
	@Test
	public void testSPARCComputer() {
		ComputerFactory factory = ComputerFactory.getInstance(ComputerType.SPARC);
		Computer comp = factory.createComputer();
		comp.setCpu(factory.createCPU());
		comp.setMotherboard(factory.createMotheboard());
		comp.setRom(factory.createROM());

		assertTrue(comp.getType() == ComputerType.SPARC);
	}
}
