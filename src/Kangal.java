import java.time.LocalDate;
import java.time.Month;

import data.*;

import ui.*;

public class Kangal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//create new player entity
		Player p = new Player("Robinho", LocalDate.of(1980, Month.JANUARY, 25), Nationality.TURKEY);
		
		//set profile picture for the player
		p.setPicture( new KangalPicture("robinho.jpeg")); //create a KangalPicture instance from image path
		
		DatabaseManager dbm = new DatabaseManager();
		dbm.createPlayer(p);
		dbm.loadPlayers(p.toString());
		//initialize ui screen
		Screen s = new Screen("Kangal Stat Keeper");
		//set current scene of the screen
		LoginScene ls = new LoginScene(s);
		ProfileScene ps = new ProfileScene(s, p);
		ls.setNext(ps);
		s.setScene(ls); //generate profile scene of Robinho
		
		Screen s2 = new Screen("Search");
		s2.setScene(new SearchScene(dbm, s2));
		
		Screen s3 = new Screen("Soccer");
		s3.setScene(new SoccerLoginScene(s3));
		
		Screen s4 = new Screen("Basketball");
		s4.setScene(new BasketballLoginScene(s4));
		
		Screen s5 = new Screen("Tennis");
		s5.setScene(new TennisLoginScene(s5));
		
	}

}
