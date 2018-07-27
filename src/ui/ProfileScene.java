package ui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;

import javax.swing.JButton;

import data.Player;

public class ProfileScene extends Scene {

	Player player;
	IDPanel idp;
	
	//generic profile scene setup
	public ProfileScene( Screen scr, Player p) {
		//init
		super(scr);
		player = p;
		
		add(new IDPanel(p));
		add(new PlayerStatsPanel(p));
		render();
	}
	
}
