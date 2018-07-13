import java.time.LocalDate;
import java.time.Month;

import data.Player;
import data.Nationality;

import ui.ProfileScene;
import ui.Screen;

public class Kangal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Screen s = new Screen("Kangal Stat Keeper");
		Player p = new Player("Robinho", LocalDate.of(1980, Month.JANUARY, 25), Nationality.TURKEY);
		s.setScene(new ProfileScene(p));
	}

}
