import java.time.LocalDate;
import java.time.Month;

import data.KangalPicture;
import data.Player;
import data.Nationality;

import ui.ProfileScene;
import ui.Screen;

public class Kangal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//create new player entity
		Player p = new Player("Robinho", LocalDate.of(1980, Month.JANUARY, 25), Nationality.TURKEY);
		//set profile picture for the player
		p.setPicture( new KangalPicture("image.jpeg")); //create a KangalPicture instance from image path
		//initialize ui screen
		Screen s = new Screen("Kangal Stat Keeper");
		//set current scene of the screen
		s.setScene(new ProfileScene(p)); //generate profile scene of Robinho
		
	}

}
