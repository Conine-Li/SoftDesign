package CatLikeDog;

public class Adapter implements Cat, Dog {

	private Cat cat=null;
	private Dog dog=null;

	public Adapter(Cat cat, Dog dog) {
		super();
		this.cat = cat;
		this.dog = dog;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}
	
	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public void wang() {
		dog.wang();
		
	}

	@Override
	public void catchMouse() {
		cat.catchMouse();

	}

	@Override
	public void action() {//狗学
		cat.catchMouse();//猫抓老鼠
		
	}

	@Override
	public void cry() {//猫学
		dog.wang();//狗叫
	}

}
