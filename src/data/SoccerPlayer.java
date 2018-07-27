package data;

import java.time.LocalDate;

public class SoccerPlayer extends Player {
	
	private SoccerPlayerStats sps;
	
	public SoccerPlayer(String name, LocalDate birthdate, Nationality nationality) {
		super(name, birthdate, nationality);
		sps = new SoccerPlayerStats();
		// TODO Auto-generated constructor stub
	}
	public SoccerPlayerStats getPlayerStats() {
		return sps;
	}
}
