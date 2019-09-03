package CompositeOfficeCommand;

import CatLikeDog.XMLUtilCat;

public class Client {
	public static void main(String []args){
		Institution  b,h,c,s;
		Unit o1,o2,o3,o4,b1,b2,b3,b4;
		b = new Institution("北京分部");
		h = new Institution("湖南分校");
		c = new Institution("长沙教学点");
		s = new Institution("湘潭教学点");
		o1 = new Office("北京教务办公室");
		o2 = new Office("湖南教务办公室");
		o3 = new Office("长沙教务办公室");
		o4 = new Office("湘潭教务办公室");
		b1 = new Office("北京行政办公室");
		b2 = new Office("湖南行政办公室");
		b3 = new Office("长沙行政办公室");
		b4 = new Office("湘潭行政办公室");
		c.add(o3);
		c.add(b3);
		s.add(o4);
		s.add(b4);
		h.add(c);
		h.add(s);
		h.add(o2);
		h.add(b2);
		b.add(h);
		b.add(o1);
		b.add(b1);
		b.handleArchives();
	}
	
}
