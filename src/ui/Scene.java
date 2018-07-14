package ui;

import java.awt.Color;

import javax.swing.*;

public class Scene extends JPanel implements Renderable {
	
	private RenderBehaviour rb;
	
	public Scene() {
		//init
		rb = new RenderBehaviour();

		//properties
		setBackground( Color.black);
	}
	
	public void render() {
		rb.perform( this);
	}
}
