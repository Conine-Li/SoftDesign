package CustomerDeepClone;

public class Address {
	private String home;
	private String email;
	private String phone;
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Address(String home, String email, String phone) {
		super();
		this.home = home;
		this.email = email;
		this.phone = phone;
	}
	public void showAddress(){
		System.out.println("Address是:");
		System.out.println("home:" +getHome());
		System.out.println("email:" +getEmail());
		System.out.println("number:" +getPhone());
	}
	
}
