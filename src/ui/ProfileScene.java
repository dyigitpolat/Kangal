package ui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.time.LocalDate;
import java.time.Period;

import data.Player;

public class ProfileScene extends Scene {

	Player player;
	KangalLabel nameLabel;
	KangalLabel nationLabel;
	KangalLabel ageLabel;
	
	public ProfileScene( Player p)
	{
		nameLabel = new KangalLabel(p.getName(), 20);
		nationLabel = new KangalLabel(p.getNationality().toString(), 20);
		
		//compute age
		int age = Period.between(p.getBirthdate(), LocalDate.now()).getYears();
		ageLabel = new KangalLabel("" + age, 50);
		
		//layout
		add(nameLabel);
		add(nationLabel);
		add(ageLabel);
		
		render();
	}
}
