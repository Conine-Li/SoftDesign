package KFC;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;
public class XMLUtilKFC
{
//该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
	public static Object getBean()
	{
		try
		{
			//创建DOM文档对象
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;							
			doc = builder.parse(new File("KFC.xml")); 
		
			//获取包含类点的文本节点
			NodeList nl = doc.getElementsByTagName("ClassName");
            Node classNode=nl.item(0).getFirstChild();
            String DBName=classNode.getNodeValue();
            
            //通过类名生成实例对象并将其返回
            Class<?> c=Class.forName("KFC."+DBName);
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
