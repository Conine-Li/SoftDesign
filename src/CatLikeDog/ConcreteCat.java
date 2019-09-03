package CatLikeDog;

public class ConcreteCat implements Cat {

	@Override
	public void cry() {
		System.out.println("猫学！！！");
		
	}
	@Override
	public void catchMouse() {
		System.out.println("猫抓老鼠！！！");

	}
}
