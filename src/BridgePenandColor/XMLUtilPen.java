package BridgePenandColor;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;
public class XMLUtilPen
{
//该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
	public static Object getBean(String args)
	{
		try
		{
			//创建DOM文档对象
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;							
			doc = builder.parse(new File("config.xml")); 
		
			//获取包含类点的文本节点
			Node classNode = null;
			NodeList nl = doc.getElementsByTagName("className3");
			if(args.equals("color")){
				classNode=nl.item(0).getFirstChild();
			}
			else if(args.equals("pen")){
				classNode=nl.item(1).getFirstChild();
			}
            String DBName=classNode.getNodeValue();
            
            //通过类名生成实例对象并将其返回
            Class<?> c=Class.forName("BridgePenandColor."+DBName);
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
