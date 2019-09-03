package CustomerDeepClone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.management.openmbean.OpenDataException;

public class Customer  implements Serializable{
	private String id;
	private String name;
	private int age;
	private Address add;
	public Customer(String id, String name, int age, Address add) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.add = add;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	//浅克隆
/*	public Customer clone(){
		Customer cus =null;
		try{
			cus = (Customer)super.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return cus;
	}*/
	//深克隆
	public Customer clone(){
		Customer cus = null;
		try{
				//将对象写入流中
				ByteArrayOutputStream bao = new ByteArrayOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(bao);
				oos.writeObject(this);
				
				//将对象从流中取出
				ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
				ObjectInputStream ois = new ObjectInputStream(bis);	
				
				cus = (Customer)ois.readObject();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		return cus;
	}
	public void show(){
		System.out.println("id:"+getId());
		System.out.println("name:"+getName());
		System.out.println("age:"+getAge());
		getAdd().showAddress();
		
	}
}
