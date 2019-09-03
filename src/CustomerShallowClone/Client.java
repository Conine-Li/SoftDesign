package CustomerShallowClone;

public class Client {
	public static void main(String []args){
		Address address = new Address("北京", "1301840357@qq.com", "18234586500");
		Customer customer = new Customer("201616040211", "袁帅", 20, address);
		Customer customer2 = customer.clone();
		customer2.setName("白向阳");
		customer2.setId("201616040213");
		customer.show();
		customer2.show();
		System.out.println("customer.equals(customer2)???");//判断对象的内容是否一致
		System.out.println(customer.equals(customer2));
		System.out.println(customer==customer2);//判断是否是同一对象
		System.out.println("customer.getAdd().equals(customer2.getAdd())???");//判断调用的方法是否一致!!
		System.out.println(customer.getAdd().equals(customer2.getAdd()));
	}
}
