package ui;

import java.awt.Color;
import javax.swing.*;

public class Screen extends JFrame{
	private int width;
	private int height;
	private Scene scene;
	
	public Screen( String title) {
		//init
		super( title);
		width = 800;
		height = 600;
		
		//frame properties
		//800x600, centered
		setSize( width, height); 
		setLocationRelativeTo( null); //center frame

		//add default scene
		setScene(new Scene());

		//show
		setVisible( true);
		setEnabled( true);
		render();
	}
	
	public void setSize(int w, int h) {
		width = w;
		height = h;
		super.setSize( width, height); 
		setLocationRelativeTo( null); //center frame
		render();
	}
	
	public void setScene(Scene s) {
		scene = s;
		getContentPane().removeAll();
		getContentPane().add(s);
		render();
	}
	
	public void render() {
		validate();
		repaint();
	}
	
}
