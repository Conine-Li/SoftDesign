package quanxianguanli;

public class UserDAO
{
    public int findPermission(String userName,String userPassword)
    {
    	if("zhangsan"==userName&&"123456"==userPassword)
    	{
    		return 0;
    	}
    	else
    	{
    		return -1;
    	}
    }
}