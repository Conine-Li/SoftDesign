package DeepClone;

import java.io.*;

import javax.management.openmbean.OpenDataException;

import ShallowClone.Attachment;

public class Email1 implements Serializable{
	private Attachment attachment = null;
	public Email1(){
		attachment = new Attachment();
	}
	public Object deepClone() throws IOException,OpenDataException, ClassNotFoundException{
		//将对象写入流中
		ByteArrayOutputStream bao = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bao);
		oos.writeObject(this);
		
		//将对象从流中取出
		ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);	
		return (ois.readObject());
		
	}
	public String getAttachment() {
		return ("askjdhakshd");
	}
	public void display(){
		System.out.println("查看邮件");
	}
}
