package ui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.Color;

import javax.swing.JPanel;

import data.KangalPicture;

//simple picture viewer panel to view KangalPicture instances
public class PictureViewer extends KangalPanel implements Renderable{
	
	RenderBehaviour rb;
	KangalPicture pic;
	int height;
	int width;
	
	public PictureViewer( KangalPicture pic, int h, int w) {
		//init 
		height = h;
		width = w;
		this.pic = pic;
		rb = new RenderBehaviour();
		
		//properties
		setPreferredSize( new Dimension(width, height));
		setSize(width, height);
		
		render();
	}
	
	public void setPicture( KangalPicture pic) {
		this.pic = pic;
		render();
	}
	
	public void paintComponent( Graphics g) {
		super.paintComponent(g);
		if( pic == null || pic.getImage() == null) {
			g.setColor(Color.RED);
			g.fillRect(0, 0, width, height);
		}
		else {
			g.drawImage(pic.getImage(),
				        0,0,width,height,
				        0,0,width,height,
				        this);
		}
	}
	
	public void render() {
		rb.perform( this);
	}
}
