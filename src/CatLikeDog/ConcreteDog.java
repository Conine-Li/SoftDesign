package CatLikeDog;

public class ConcreteDog implements Dog{
	public void wang(){
		System.out.println("狗叫！！");
	}

	@Override
	public void action() {
		System.out.println("狗在学！！");
		
	}
}
