package ComputerComponent;

public class NotebookBuilder extends ComputerBuilder {

	public void buildCpu() {
		System.out.println("我是笔记本的Cpu");
	}
	public void buildRam() {
		System.out.println("我是笔记本的存储器");
	}
	public void buildHarddisk() {
		System.out.println("我是笔记本的硬盘");
	}
	public void buildMainFrame() {
		System.out.println("我是笔记本的框架");
	}
	public void buildMonitor() {
		System.out.println("我是笔记本的显示器");
	}
}
