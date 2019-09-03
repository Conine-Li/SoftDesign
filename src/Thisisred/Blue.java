package Thisisred;

public class Blue implements MyColor {
	public Object clone(){
		Blue blue = null;
		try{
			blue = (Blue)super.clone();
		}
		catch(CloneNotSupportedException e){
		}
		return blue;
	}
	public void display(){
		System.out.println("This is Blue");
	}
}
