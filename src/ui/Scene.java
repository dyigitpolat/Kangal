package ui;

import java.awt.Color;
import javax.swing.*;

public class Scene extends JPanel {
	
	public Scene() {
		//properties
		setBackground( Color.black);
	}
	
	public void render() {
		validate();
		repaint();
	}
}
