import ui.*;
import data.*;

public class KangalFactory {
	
	public KangalFactory( String app) throws Exception {
		if( app.equals("basketball")) {
			constructBasketballApp();
		} else if ( app.equals("soccer")) {
			constructSoccerApp();
			
		} else if ( app.equals("tennis")) {
			constructTennisApp();
		} else {
			throw new Exception( "failure.");
		}
	}
	
	private void constructBasketballApp() {
		DatabaseManager dbm = new DatabaseManager();
		dbm.setDatabase( new BasketballDatabase());
		dbm.loadPlayers();
		Screen screen = new Screen("Basketball", dbm);
		LoginScene login = new BasketballLoginScene(screen);
		SearchScene search = new SearchScene(dbm, screen);
		
		login.setNext(search);
		screen.setScene(login);
		
	}
	
	private void constructSoccerApp() {
		DatabaseManager dbm = new DatabaseManager();
		dbm.setDatabase( new SoccerDatabase());
		dbm.loadPlayers();
		Screen screen = new Screen("Soccer", dbm);
		LoginScene login = new SoccerLoginScene(screen);
		SearchScene search = new SearchScene(dbm, screen);
		
		login.setNext(search);
		screen.setScene(login);
		
	}
	
	private void constructTennisApp() {
		DatabaseManager dbm = new DatabaseManager();
		dbm.setDatabase( new TennisDatabase());
		dbm.loadPlayers();
		Screen screen = new Screen("Tennis", dbm);
		LoginScene login = new TennisLoginScene(screen);
		SearchScene search = new SearchScene(dbm, screen);
		
		login.setNext(search);
		screen.setScene(login);
	}
}
