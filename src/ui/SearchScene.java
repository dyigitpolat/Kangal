package ui;

import data.BasketballDatabase;
import data.BasketballPlayer;
import data.DatabaseManager;
import data.Player;
import data.SoccerPlayer;
import data.TennisPlayer;

public class SearchScene extends Scene {

	private SearchBarPanel sbp;
	private SearchResultsPanel srp;
	private DatabaseManager dbm;
	
	public SearchScene(DatabaseManager dbm, Screen scr) {
		super(scr);
		this.dbm = dbm;
		add( new SearchBarPanel());
		add( new SearchResultsPanel(this));
		
		
		render();
	}
	
	public DatabaseManager getDatabaseManager() {
		return dbm;
	}
	
	public void navigate(Player p) {
		try {
			navigate( (BasketballPlayer) p);
			return;
		} catch( Exception e) {
			
		}
		
		try {
			navigate( (SoccerPlayer) p);
			return;
		} catch( Exception e) {
			
		}
		
		try {
			navigate( (TennisPlayer) p);
			return;
		} catch( Exception e) {
			
		}
	}
	
	public void navigate(SoccerPlayer p) {
		getScreen().setScene( new DetailScene(getScreen(), p));
	}
	
	public void navigate(TennisPlayer p) {
		getScreen().setScene( new DetailScene(getScreen(), p));
	}
	
	public void navigate(BasketballPlayer p) {
		getScreen().setScene( new DetailScene(getScreen(), p));
	}

}
