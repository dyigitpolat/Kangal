import java.time.LocalDate;
import java.time.Month;

import data.*;

import ui.*;

public class Kangal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			KangalFactory kf = new KangalFactory("basketball");

			KangalFactory kf1 = new KangalFactory("tennis");

			KangalFactory kf2 = new KangalFactory("soccer");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
