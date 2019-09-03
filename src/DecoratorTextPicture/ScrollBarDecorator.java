package DecoratorTextPicture;

public class ScrollBarDecorator extends Decorator {
	public ScrollBarDecorator(Component component){
		super(component);
	}
	public void display(){
		System.out.println("增加滚动条");
		super.display();
	}
}
