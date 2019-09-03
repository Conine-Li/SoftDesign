package SingletonMultiton;

import java.util.Random;

public class Multiton {
	//私有的静态属性。全部实例化
	private static Multiton[] array = {new Multiton(),new Multiton(),new Multiton(),new Multiton()};
	//私有构造函数。不允许在new一个对象，只能在这四个中选择
	private Multiton(){}
	//公有静态工厂方法，得到实例
	public static Multiton getInstance(){
		return array[random()];
	}
	
	public static int random(){
		Random random = new Random();
		int value = Math.abs(random.nextInt());//随机取值 ，看是否相同
		value = value%4;
		return value;
	}
	
	public static void main(String []args){
		Multiton m1,m2,m3,m4;
		m1 = Multiton.getInstance();
		m2 = Multiton.getInstance();
		m3 = Multiton.getInstance();
		m4 = Multiton.getInstance();
		
		//看得到的实例化的对象是否相同，看是不是同一个对象
		System.out.println(m1==m2);
		System.out.println(m1==m3);
		System.out.println(m1==m4);
		System.out.println();
	}
}
