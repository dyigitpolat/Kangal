package data;

import java.awt.image.BufferedImage;

public class KangalPicture
{
	private BufferedImage image; 
	private ImageLoader loader;
	private String path;
	
	public KangalPicture( String path) {
		this.path = path;
		loader = new ImageLoader();
		image = loader.load(path);
	}
	
	public BufferedImage getImage() {
		return image;
	}
	
	public String getPath() {
		return path;
	}
}
