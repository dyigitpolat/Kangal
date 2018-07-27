package ui;

import java.awt.Dimension;
import java.awt.Font;

import data.KangalPicture;

public class BasketballLogoPanel extends LogoPanel {

	public BasketballLogoPanel() {
		setPreferredSize(new Dimension(650,400));
		setLogo( new KangalPicture("basketballlogo.png") );
		setTitle( "Basketball-Stat Tracker");
	}
	
}
