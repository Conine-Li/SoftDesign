package Thisisred;

import java.awt.RenderingHints.Key;
import java.util.*;

public class PrototypeManager {
	private Hashtable<Object, Object> ht = new Hashtable<>();//将可以key和value结合起来构成键值对通过put(key,value)方法保存起来，然后通过get(key)方法获取相对应的value值。
	
	public PrototypeManager(){
		ht.put("red", new Red());
		ht.put("blue", new Blue());
	}
	
	
	public void addColor(String key,MyColor obj){
		ht.put(key, obj);
	}
	
	public MyColor getColor(String key){
		return (MyColor)((MyColor)ht.get(key)).clone();
	}
}
