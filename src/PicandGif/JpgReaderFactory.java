package PicandGif;
public class JpgReaderFactory implements ImageReaderFactory {

	@Override
	public ImageReader createImageReader() {
		System.out.print("我是JPG工厂");
		return new JpgReader();
	}

}
