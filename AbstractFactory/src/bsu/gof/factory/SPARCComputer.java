package bsu.gof.factory;

public class SPARCComputer extends Computer{
	
	@Override
	public ComputerType getType() {
		return ComputerType.SPARC;
	}
}
