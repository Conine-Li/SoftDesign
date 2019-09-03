package DecoratorBianXingJinGang;

public class Airplane extends Change {
	 public Airplane(Transform transform){
		super(transform);
		System.out.println("变成机器人");
	}
	
	public void  fly() {
		System.out.println("飞翔！！！");
	}
}
