package ui;

import java.awt.Dimension;
import java.time.LocalDate;
import java.time.Period;

import data.Player;
import data.SoccerPlayer;

public class SoccerPlayerStatsPanel extends PlayerStatsPanel{
	SoccerPlayer p;
	KangalLabel yellowCardsLabel;
	KangalLabel redCardsLabel;
	KangalLabel scorePerGameLabel;
	KangalLabel manOfTheMatchLabel;
	KangalLabel tacklesLabel;
	KangalLabel offsidesLabel;
	public SoccerPlayerStatsPanel(SoccerPlayer p) {
		super(p);
		scorePerGameLabel = new KangalLabel("Score Per Game = "+p.getPlayerStats().getScorePerGame(), 20);
		manOfTheMatchLabel = new KangalLabel("Man of the Match = "+p.getPlayerStats().getManOfTheMatch(), 20);
		yellowCardsLabel = new KangalLabel("Yellow Cards = "+p.getPlayerStats().getYellowCards(), 20);
		redCardsLabel = new KangalLabel("Red Cards = "+p.getPlayerStats().getRedCards(), 20);
		tacklesLabel = new KangalLabel("Tackles = "+p.getPlayerStats().getTackles(), 20);
		offsidesLabel = new KangalLabel("Offsides = "+p.getPlayerStats().getOffsides(), 20);
		//layout
		
		add(scorePerGameLabel);
		add(manOfTheMatchLabel);
		add(yellowCardsLabel);
		add(redCardsLabel);
		add(tacklesLabel);
		add(offsidesLabel);
		
		render();
	}

}
