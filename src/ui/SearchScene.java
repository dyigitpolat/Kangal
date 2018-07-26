package ui;

import data.DatabaseManager;

public class SearchScene extends Scene {

	private SearchBarPanel sbp;
	private SearchResultsPanel srp;
	private DatabaseManager dbm;
	
	public SearchScene(DatabaseManager dbm, Screen scr) {
		super(scr);
		this.dbm = dbm;
		add( new SearchBarPanel());
		// TODO Auto-generated constructor stub
		
		render();
	}
	
	public DatabaseManager getDatabaseManager() {
		return dbm;
	}

}
