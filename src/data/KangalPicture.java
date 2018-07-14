package data;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class KangalPicture
{
	private BufferedImage image; 
	
	public KangalPicture( String path) {
		//empty the shopping cart
		image = null;
		try {
			//load image from path
		    image = ImageIO.read(new File(path));
		} catch (IOException e) {
			e.printStackTrace();
			image = null;
		}
		
		//if still empty, should warn us.
		if( image == null) {
			System.out.println("image problem");
		} else {
			System.out.println("image loaded");
		}
	}
	
	public BufferedImage getImage() {
		return image;
	}
}
