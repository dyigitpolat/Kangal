package ui;

import data.TennisPlayer;

public class TennisPlayerStatsPanel extends PlayerStatsPanel{
	KangalLabel doublePlayStatLabel;
	KangalLabel acesLabel;
	KangalLabel doubleFaultsLabel;
	public TennisPlayerStatsPanel(TennisPlayer p) {
		super(p);
		doublePlayStatLabel = new KangalLabel("Double Play = "+p.getPlayerStats().getDoublePlayStat(), 20);
		acesLabel = new KangalLabel("Aces = "+p.getPlayerStats().getAces(), 20);
		doubleFaultsLabel = new KangalLabel("Double Faults = "+p.getPlayerStats().getDoubleFaults(), 20);
		add(doublePlayStatLabel);
		add(acesLabel);
		add(doubleFaultsLabel);
	}
}
