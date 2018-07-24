package ui;

import java.awt.Color;
import javax.swing.*;

public class Screen extends JFrame implements Renderable {
	private int width;
	private int height;
	private Scene scene;
	private RenderBehaviour rb;
	
	public Screen( String title) {
		//init
		super( title);
		width = 800;
		height = 600;
		rb = new RenderBehaviour();
		
		//frame properties
		//800x600, centered
		setWindowSize( width, height); 
		setResizable(false);

		//add default scene
		setScene(new Scene(this));

		//show
		setVisible( true);
		setEnabled( true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		render();
	}
	
	public void setWindowSize(int w, int h) {
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
		rb.perform( this);
	}
	
}
