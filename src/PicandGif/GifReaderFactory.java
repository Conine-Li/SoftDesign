package PicandGif;
public class GifReaderFactory implements ImageReaderFactory {

	@Override
	public ImageReader createImageReader() {
		System.out.print("我是Gif工厂");
		return new GifReader();
	}

}
