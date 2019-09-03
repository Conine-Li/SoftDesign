package ComputerComponent;

public class ServerBuilder extends ComputerBuilder {
	public void buildCpu() {
		System.out.println("我是服务机的Cpu");
	}
	public void buildRam() {
		System.out.println("我是服务机的存储器");
	}
	public void buildHarddisk() {
		System.out.println("我是服务机的硬盘");
	}
	public void buildMainFrame() {
		System.out.println("我是服务机的框架");
	}
	public void buildMonitor() {
		System.out.println("我是服务机的显示器");
	}
}
