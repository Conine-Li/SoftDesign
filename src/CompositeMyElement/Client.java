package CompositeMyElement;

public class Client
{
	public static void main(String a[])
	{
		MyElement obj1,obj2,obj3,obj4,obj5;
		Plate plate1,plate2,plate3;
		
		obj1=new Apple();//最小的容器中放 苹果梨子
		obj2=new Pear();
		plate1=new Plate();//在最大的容器中放最小的容器
		plate1.add(obj1);
		plate1.add(obj2);
		
		obj3=new Banana();
		obj4=new Banana();
		plate2=new Plate();//在最大容器中放一个第二小的容器，里面放俩香蕉
		plate2.add(obj3);
		plate2.add(obj4);
		
		obj5=new Apple();
		plate3=new Plate();//在最大的容器中放一个苹果，苹果和另外两个容器平级
		plate3.add(plate1);
		plate3.add(plate2);
		plate3.add(obj5);
			
		plate3.eat();
	}
}
