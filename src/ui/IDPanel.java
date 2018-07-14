package ui;

import java.awt.Dimension;
import java.time.LocalDate;
import java.time.Period;

import data.KangalPicture;
import data.Player;

public class IDPanel extends KangalPanel {

	Player p;
	PictureViewer pv;
	KangalLabel nameLabel;
	KangalLabel nationLabel;
	KangalLabel ageLabel;
	
	//panel properties
	int height = 300;
	int width = 200;
	
	public IDPanel( Player p) {
		//init
		this.p = p;
		
		pv = new PictureViewer(p.getPicture(), 200, 150); //profile picture h:200 w:150
		nameLabel = new KangalLabel(p.getName(), 20);
		nationLabel = new KangalLabel(p.getNationality().toString(), 20);
		
		//compute age
		int age = Period.between(p.getBirthdate(), LocalDate.now()).getYears();
		ageLabel = new KangalLabel("" + age, 50);
		
		//layout
		setPreferredSize( new Dimension(width, height));
		
		add(pv);
		add(nameLabel);
		add(nationLabel);
		add(ageLabel);
		
		render();
	}
}
