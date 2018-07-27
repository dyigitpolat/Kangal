package data;

import java.util.List;

public class SearchBehaviour {
	Database db;
	
	public SearchBehaviour( Database db) {
		this.db = db;
	}
	
	
	public List<Player> perform( String field, int value, SearchOperator op) {
		return db.getDatabase();
	}
	
}
