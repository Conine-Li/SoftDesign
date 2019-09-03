package ComputerComponent;

public class DesktopBuilder extends ComputerBuilder {
	public void buildCpu() {
		System.out.println("我是pc的Cpu");
	}
	public void buildRam() {
		System.out.println("我是pc的存储器");
	}
	public void buildHarddisk() {
		System.out.println("我是pc的硬盘");
	}
	public void buildMainFrame() {
		System.out.println("我是pc的框架");
	}
	public void buildMonitor() {
		System.out.println("我是pc的显示器");
	}
}
