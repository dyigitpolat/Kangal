package ui;

import data.BasketballPlayer;
public class BasketballPlayerStatsPanel extends PlayerStatsPanel{
	BasketballPlayer p;
	KangalLabel fGoalPerGameLabel;
	KangalLabel minsPerGameLabel;
	KangalLabel threePPerGameLabel;
	public BasketballPlayerStatsPanel(BasketballPlayer p) {
		super(p);
		fGoalPerGameLabel = new KangalLabel("Field Goal Per Game = "+p.getPlayerStats().getfGoalPerGame(), 20);
		minsPerGameLabel = new KangalLabel("Minutes Per Game = "+p.getPlayerStats().getMinsPerGame(), 20);
		threePPerGameLabel = new KangalLabel("Three Points Per Game = "+p.getPlayerStats().getThreePPerGame(), 20);
		//layout
		
		add(fGoalPerGameLabel);
		add(minsPerGameLabel);
		add(threePPerGameLabel);
		render();
	}

}