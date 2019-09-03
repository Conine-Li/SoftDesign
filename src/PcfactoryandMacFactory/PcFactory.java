package PcfactoryandMacFactory;

public class PcFactory implements AbstarctFactory {
	public RAM getRAM() {
		return new PcRam();
	}
	public CPU getCPU() {
		return new PcCPU();
	}
}
