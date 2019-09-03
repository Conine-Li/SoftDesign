package DecoratorBianXingJinGang;

public class Client
{
	public static void main(String args[])
	{
		Transform camaro;
		camaro=new Car();
		camaro.move();
		System.out.println("-----------------------------");
		
		Airplane bumblebee=new Airplane(camaro);
		bumblebee.move();//调用父类方法
		bumblebee.fly();
	}
}