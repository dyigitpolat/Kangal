package ui;

import data.BasketballPlayer;
import data.Player;
import data.SoccerPlayer;

public class DetailScene extends Scene{

	Scene nextScn;
	LogoPanel logoPanel;
	Player player;
	
	public DetailScene( Screen scr, SoccerPlayer p) {
		super(scr);
		player = p;
		add(new IDPanel(p));
		add(new SoccerPlayerStatsPanel(p));
		// TODO Auto-generated constructor stub
	}
	public DetailScene( Screen scr, BasketballPlayer p) {
		super(scr);
		player = p;
		add(new IDPanel(p));
		add(new BasketballPlayerStatsPanel(p));
		// TODO Auto-generated constructor stub
	}
	public void setNext( Scene nextScn) {
		this.nextScn = nextScn;
	}
	/*public void setDetailPanel( DetailPanel detailPanel) {
		removeAll();
		this.detailPanel = detailPanel;
		add(new IDPanel(player));
		add(detailPanel);
	}*/
}
