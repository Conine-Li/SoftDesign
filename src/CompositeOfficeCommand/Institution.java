package CompositeOfficeCommand;

import java.util.ArrayList;

public class Institution<E> extends Unit {

	private ArrayList list = new ArrayList<E>();
	private String name;
	public Institution(String name) {
		super();
		this.name = name;
	}
	public void add(Unit unit){
		list.add(unit);
	}
	public void handleArchives() {
		System.out.println(this.name+"接受并下发公文");
		for(Object obj:list){
			((Unit)obj).handleArchives();
		}

	}

}
