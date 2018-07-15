package data;

import java.util.List;

public class SearchBehaviour {
	DatabaseManager dbm;
	
	public SearchBehaviour( DatabaseManager dbm) {
		this.dbm = dbm;
	}
	
	public List<Player> perform( String field, Object value, SearchOperator op) {
		throw new IllegalArgumentException("Unsupported search field type.");
	}
	
	public List<Player> perform( String field, String value, SearchOperator op) {
		return null;
	}
	
	public List<Player> perform( String field, Integer value, SearchOperator op) {
		return null;
	}
}
