package DecoratorTextPicture;

public class Client {
	public static void main(String []args){
		Component com = new PictureView();
		com.display();
		Component com1 = new ScrollBarDecorator(com);
		com1.display();
		System.out.println("--------------------");
		Component com2 = new TextView();
		com2.display();
		Component com3 = new BlackBorderDecorator(com2);
		com3.display();
	}
}
