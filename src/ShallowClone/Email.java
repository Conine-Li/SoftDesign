package ShallowClone;

public class Email extends Object implements Cloneable{
	private Attachment attachment = null;
	public Email(){
		this.attachment = new Attachment();
	}
	public Object clone(){
		Email clone = null;
		try{
			clone = (Email)super.clone();
		}catch(Exception e){
			System.out.println("Clone Failure!");
		}
		return clone;
	}
	public Attachment getAttachment() {
		return attachment;
	}
	public void display(){
		System.out.println("查看邮件");
	}
}
