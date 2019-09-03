package PcfactoryandMacFactory;

public class Client {
	public static void main(String []args){
		try{
			AbstarctFactory a ;
			RAM ram;
			CPU cpu;
			a=(AbstarctFactory)XMLUtil.getBean();
			ram = a.getRAM();
			ram.RamInfluence();
			cpu = a.getCPU();
			cpu.influence();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
