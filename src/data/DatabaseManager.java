package data;

import java.util.List;

public class DatabaseManager {
	
	private CreateBehaviour cb;
	private SearchBehaviour sb;
	private LoadBehaviour lb;
	private Database db;
	
	public DatabaseManager() {
		db = new Database();
		cb = new CreateBehaviour(db);
		sb = new SearchBehaviour(db);
		lb = new LoadBehaviour(db);
	}
	
	public void createPlayer( Player p) {
		cb.perform( p);
	}
	
	public List<Player> searchPlayer( String field, int value, SearchOperator op) {
		try {
			return sb.perform(field, value, op);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public void loadPlayers()
	{
		lb.perform(db);
	}
	
	public void setDatabase( Database db) {
		this.db = db;
		cb = new CreateBehaviour(db);
		sb = new SearchBehaviour(db);
		lb = new LoadBehaviour(db);
	}
}
