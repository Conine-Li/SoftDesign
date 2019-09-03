package SQLconnectionAndstatement;

import javax.xml.parsers.*;

import java.lang.*;

import org.w3c.dom.*;

import java.io.*;
public class XMLUtil
{
//该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
	@SuppressWarnings("rawtypes")
	public static Object getBean()
	{
		try
		{
			//创建DOM文档对象
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;							
			doc = builder.parse(new File("config.xml")); 
		
			//获取包含类点的文本节点
			NodeList nl = doc.getElementsByTagName("DBName");
            Node classNode=nl.item(0).getFirstChild();
            String DBName=classNode.getNodeValue();
            
            //通过类名生成实例对象并将其返回
            Class<?> c=Class.forName("SQLconnectionAndstatement."+DBName);
	  	    Object obj=c.newInstance();
            return obj;
           }   
           	catch(Exception e)
           	{
           		e.printStackTrace();
           		return null;
           	}
		}
}
