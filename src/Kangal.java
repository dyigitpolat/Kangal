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
		p.setPicture( new KangalPicture("image.jpeg")); //create a KangalPicture instance from image path
		
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
		
		
	}

}
