package ui;

import java.awt.Color;

import javax.swing.*;

public class Scene extends JPanel implements Renderable {
	
	private RenderBehaviour rb;
	private Screen scr;
	
	public Scene( Screen scr) {
		//init
		rb = new RenderBehaviour();

		//Screen
		this.scr = scr;
		
		//properties
		setBackground( Color.black);
	}
	
	public Screen getScreen() {
		return scr;
	}
	
	public void render() {
		rb.perform( this);
	}
}
