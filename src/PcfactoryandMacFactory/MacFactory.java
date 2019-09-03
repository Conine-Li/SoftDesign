package PcfactoryandMacFactory;

public class MacFactory implements AbstarctFactory {
	public RAM getRAM() {
		return new MacRam();
	}
	public CPU getCPU() {
		return new MacCPU();
	}
}
