package ui;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JTextField;

public class SearchBarPanel extends KangalPanel {
	public SearchBarPanel() {
		setPreferredSize( new Dimension( 600, 50));
		JTextField tf = new JTextField();
		JButton b = new JButton("SEARCH");
		tf.setFont(new Font("Arial", 0, 24));
		tf.setPreferredSize( new Dimension(400, 30));
		b.setPreferredSize( new Dimension(100, 30));
		b.setSize( new Dimension(99, 50));
		
		add( tf);
		add( b);
		render();
	}
}
