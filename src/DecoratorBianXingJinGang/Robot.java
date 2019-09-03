package DecoratorBianXingJinGang;

public class Robot extends Change {
	public Robot(Transform transform){
		super(transform);//调用父类的构造函数
		System.out.println("变成机器人");
	}
	
	public void  say() {
		System.out.println("说话！！！");
	}
}
