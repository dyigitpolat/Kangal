package ui;

import java.awt.Dimension;

import data.KangalPicture;

public class LogoPanel extends KangalPanel {
	PictureViewer logo;
	KangalLabel nameLabel;
	public LogoPanel() {
		logo = new PictureViewer(new KangalPicture("kangal.png"), 300, 300);
		nameLabel = new KangalLabel("Kangal Stat-Tracker", 60);
		add(logo);
		add(nameLabel);
		setPreferredSize( new Dimension( 600, 400));
		render();
	}
	
	public void setLogo( KangalPicture pic) {
		logo.setPicture( pic);
		render();
	}
	
	public void setTitle( String title) {
		nameLabel.setText( title);
		render();
	}
}
