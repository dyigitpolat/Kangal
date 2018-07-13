package ui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class KangalLabel extends JLabel {
	public KangalLabel( String title, int size) {
		super(title);
		setFont(new Font("Arial", 0, size));
		setForeground(Color.WHITE);
	}
}
