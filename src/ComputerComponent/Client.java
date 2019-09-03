package ComputerComponent;

public class Client {
	public static void main(String []args){
		ComputerBuilder cb = (ComputerBuilder)XMLUtilComputer.getBean();
		ComputerAssembleDirector director = new ComputerAssembleDirector();
		director.setComputerBuilder(cb);
		Computer computer = director.assemble();
	}
}
