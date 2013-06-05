package bsu.gof.factory;

public abstract class Computer {
	private Motherboard motherboard;
	private ROM rom;
	private CPU cpu;

	public Motherboard getMotherboard() {
		return motherboard;
	}
	public void setMotherboard(Motherboard motherboard) {
		this.motherboard = motherboard;
	}
	public ROM getRom() {
		return rom;
	}
	public void setRom(ROM rom) {
		this.rom = rom;
	}
	public CPU getCpu() {
		return cpu;
	}
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	public abstract ComputerType getType();
}
