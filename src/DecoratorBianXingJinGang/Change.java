package DecoratorBianXingJinGang;

public class Change {
	private Transform transform;//私有属性
	//公有全参构造函数
	public Change(Transform transform){
		this.transform = transform;
	}
	
	public void move(){
		transform.move(); 
	}
}
