import ui.*;
import data.*;

public class KangalFactory {
	
	public KangalFactory( String app) throws Exception {
		if( app.equals("basketball")) {
			constructBasketballApp();
		} else if ( app.equals("soccer")) {
			
			
		} else if ( app.equals("tennis")) {
			
		} else {
			throw new Exception( "failure.");
		}
	}
	
	private void constructBasketballApp() {
		DatabaseManager dbm = new DatabaseManager();
		Screen screen = new Screen("Basketball");
		LoginScene login = new BasketballLoginScene(screen);
		SearchScene search = new SearchScene(dbm, screen);
		
		login.setNext(search);
		screen.setScene(login);
		
	}
	
	private void constructSoccerApp() {

		
	}
	
	private void constructTennisApp() {
		
	}
}
