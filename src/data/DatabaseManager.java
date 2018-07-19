package data;

import java.util.List;

public class DatabaseManager {
	
	private CreateBehaviour cb;
	private SearchBehaviour sb;
	private LoadBehaviour lb;
	
	public DatabaseManager() {
		cb = new CreateBehaviour(this);
		sb = new SearchBehaviour(this);
		lb = new LoadBehaviour(this);
	}
	
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
	
	public List<Player> loadPlayers( String s)
	{
		lb.perform(s);
		return null;
	}
}
