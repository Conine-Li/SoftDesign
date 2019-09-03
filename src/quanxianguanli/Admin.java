package quanxianguanli;

public class Admin extends User{
	public Admin(){
		System.out.println("创建管理员对象");
	}
	public void diffOperation(){
		System.out.println("管理员拥有创建和管理假条的权限！！");
	}
}
