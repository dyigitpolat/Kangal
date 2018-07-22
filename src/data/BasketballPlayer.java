package data;

import java.time.LocalDate;

public class BasketballPlayer extends Player {
	private BasketballPlayerStats bps;
	
	public BasketballPlayer( String name, LocalDate birthdate, Nationality nationality) {
		
		super(name, birthdate, nationality);
		bps = new BasketballPlayerStats();
		
		
	}
	
	
}
