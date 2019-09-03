package CompositeOfficeCommand;

public class Office extends Unit {

	private String name;
	public Office(String name) {
		super();
		this.name = name;
	}
	public void handleArchives() {
		System.out.println(this.name+"处理公文!");

	}

}
