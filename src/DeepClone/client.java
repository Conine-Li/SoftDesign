package DeepClone;

import ShallowClone.Email;

public class client {
	public static void main(String[] args){
		Email1 email,copyEmail = null;
		email = new Email1();
		try{
			copyEmail = (Email1)email.deepClone();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		System.out.println("eamil==copyEmail???");
		System.out.println(email==copyEmail);
		
		System.out.println("email.getAttachment == copyEmail.getAttachment？？？");
		System.out.println(email.getAttachment());
		email.display();
		System.out.println("分割线");
		System.out.println(copyEmail.getAttachment());
		copyEmail.display();
	}
}
