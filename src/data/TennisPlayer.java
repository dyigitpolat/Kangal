package data;

import java.time.LocalDate;

public class TennisPlayer extends Player {
	private TennisPlayerStats tps;
	
	public TennisPlayer(String name, LocalDate birthdate, Nationality nationality) {
		super(name, birthdate, nationality);
		tps = new TennisPlayerStats();
		// TODO Auto-generated constructor stub
	}
	public TennisPlayerStats getPlayerStats() {
		return tps;
	}
}
