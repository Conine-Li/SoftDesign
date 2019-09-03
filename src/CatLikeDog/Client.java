package CatLikeDog;

public class Client {
	public static void main(String []args){
		//Adapter adapter = (Adapter)XMLUtilCat.getBean();
		//adapter.cry();
		//adapter.action();

        Dog dog = new ConcreteDog();
        Cat cat = new ConcreteCat();
        Adapter adapter = new Adapter(cat,dog);
        dog.action();
        adapter.catchMouse();
        cat.cry();
        adapter.cry();

	}
}
