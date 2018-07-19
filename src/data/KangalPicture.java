package data;

import java.awt.image.BufferedImage;

public class KangalPicture
{
	private BufferedImage image; 
	private ImageLoader loader;
	
	public KangalPicture( String path) {
		loader = new ImageLoader();
		image = loader.load(path);
	}
	
	public BufferedImage getImage() {
		return image;
	}
}
