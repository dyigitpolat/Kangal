package data;

import java.util.ArrayList;
import java.util.List;

public class Database {
	
	private List<Player> listPlayers;
	
	public Database() {
		setDatabase( new ArrayList<Player>());
		
	}
	
	public void addPlayer( Player p) {
		listPlayers.add( p);
	}
	
	public void setDatabase( List<Player> list) {
		listPlayers = list;
	}
}
