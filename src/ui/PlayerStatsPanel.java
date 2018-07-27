package ui;

import java.awt.Dimension;
import java.time.LocalDate;
import java.time.Period;

import data.Player;
import data.PlayerStats;

public class PlayerStatsPanel extends KangalPanel {

	PlayerStats ps;
	KangalLabel appearencesLabel;
	KangalLabel scoresLabel;
	
	//panel properties
	int height = 300;
	int width = 220;
	
	public PlayerStatsPanel( Player p) {
		//init
		ps = p.getPlayerStats();
		
		appearencesLabel = new KangalLabel("Appearences:" + ps.getAppearances(), 20);
		scoresLabel = new KangalLabel("Scores:" + ps.getScores(), 20);
		//layout
		setPreferredSize( new Dimension(width, height));
		
		add(appearencesLabel);
		add(scoresLabel);
		
		render();
	}
}
