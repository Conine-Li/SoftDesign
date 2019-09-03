package DecoratorTextPicture;

public class Decorator extends Component {
	private Component component;
	public void display() {
		component.display();
	}
	public Decorator(Component component){
		this.component = component;
	}
}
