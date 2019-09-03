package ComputerComponent;

public class ComputerAssembleDirector {
	public ComputerBuilder cb;
	public void setComputerBuilder(ComputerBuilder cb){
		this.cb=cb;
	}
	public Computer assemble(){
		cb.buildCpu();
		cb.buildHarddisk();
		cb.buildMainFrame();
		cb.buildMonitor();
		cb.buildRam();
		return cb.produceComputer();
	}
}
