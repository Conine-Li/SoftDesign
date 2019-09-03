package nvwa;

public class Client {
	public static void main(String []args){
		try{
                        nvwa nvwa1=new nvwa();
                        Person person;
                        person=nvwa1.makePerson('M');
                        person.eat();
                        person.sleep();
		}
		catch(Exception ee){
			System.out.print(ee.getMessage());
		}
	}
}
