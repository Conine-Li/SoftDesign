package PicandGif;
public class Client {
	public static void main(String []args){
		try{
			ImageReaderFactory iReaderFactory;
			ImageReader iReader;
			iReaderFactory = (ImageReaderFactory)XMLUtil.getBean();
			iReader = iReaderFactory.createImageReader();
			iReader.readImage();
		}
		catch(Exception ee){
			System.out.print(ee.getMessage());
		}
	}
}
