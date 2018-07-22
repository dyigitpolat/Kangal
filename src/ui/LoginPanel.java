package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;

public class LoginPanel extends KangalPanel {
	
	LoginScene scn;
	JTextArea userTxt;
	JPasswordField passTxt;
	LoginButton loginBtn;
	
	public LoginPanel( LoginScene scn) {
		//init
		this.scn = scn;
		userTxt = new JTextArea();
		passTxt = new JPasswordField();
		loginBtn = new LoginButton();
		
		//properties
		userTxt.setFont(new Font("Arial", 0, 24));
		userTxt.setFont(new Font("Arial", 0, 24));
		userTxt.setPreferredSize( new Dimension(150, 30));
		passTxt.setPreferredSize( new Dimension(150, 30));
		add(new KangalLabel("Username:", 20));
		add(userTxt);
		add(new KangalLabel("Password:", 20));
		add(passTxt);
		add(loginBtn);
		
		render();
	}
	
	public void tryLogin(String user, String pass) {
		scn.tryLogin(user, pass);
	}
	
	class LoginButton extends JButton {
		public LoginButton() {
			super("Login");
			addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  tryLogin(userTxt.getText(), new String(passTxt.getPassword()));
			  } 
			} );
		}
	}
}
