package data;

import java.util.List;

public class DatabaseManager {
	
	private CreateBehaviour cb;
	private SearchBehaviour sb;
	
	public void createPlayer( Player p) {
		cb.perform( p);
	}
	
	public List<Player> searchPlayer( String field, Object value, SearchOperator op) {
		try {
			return sb.perform(field, value, op);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
