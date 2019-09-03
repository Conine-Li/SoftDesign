package DecoratorTextPicture;

public class BlackBorderDecorator extends Decorator {
	public BlackBorderDecorator(Component component){
		super(component);
	}
	public void display(){
		System.out.println("增加黑色边框");
		super.display();
	}
}
