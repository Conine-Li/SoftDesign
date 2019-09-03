package quanxianguanli;

public class UserFactory
{
	public static User getUser(int permission)
	{
		if(0==permission)
		{
			return new Employee();
		}
		else if(1==permission)
		{
			return new Manager();
		}
		else if(2==permission)
		{
			return new Admin();
		}
		else
		{
			return null;
		}
	}
}