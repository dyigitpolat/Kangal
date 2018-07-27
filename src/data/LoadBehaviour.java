package data;

import java.time.LocalDate;
import java.time.Month;

public class LoadBehaviour {
	Database db;
	
	public LoadBehaviour( Database db) {
		this.db = db;
	}
	
	public LoadBehaviour( SoccerDatabase db) {
		this.db = db;
	}
	
	public LoadBehaviour( TennisDatabase db) {
		this.db = db;
	}
	
	public LoadBehaviour( BasketballDatabase db) {
		this.db = db;
	}
	
	public void perform( Database db) {

		try {
			perform( (BasketballDatabase) db);
			return;
		} catch( Exception e) {
			
		}
		
		try {
			perform( (SoccerDatabase) db);
			return;
		} catch( Exception e) {
			
		}
		
		try {
			perform( (TennisDatabase) db);
			return;
		} catch( Exception e) {
			
		}
		
		System.out.println("generic load");
		//1
		Player robinho = new Player("Robinho", LocalDate.of(1980, Month.JANUARY, 25), Nationality.TURKEY);
		robinho.getPlayerStats().setAppearances(3522);
		robinho.getPlayerStats().setScores(25);
		
		//2
		Player ilhan = new Player("İlhan Mansız", LocalDate.of(1984, Month.JANUARY, 25), Nationality.GERMANY);
		ilhan.getPlayerStats().setAppearances(123);
		ilhan.getPlayerStats().setScores(2);
		
		//3
		Player maria = new Player("Maria Sharapova", LocalDate.of(1983, Month.JANUARY, 25), Nationality.ENGLAND);
		maria.getPlayerStats().setAppearances(634);
		maria.getPlayerStats().setScores(4);
		
		//4
		Player lebron = new Player("Lebro James", LocalDate.of(1983, Month.JANUARY, 25), Nationality.ENGLAND);
		lebron.setPicture(new KangalPicture("lebron.jpeg"));
		lebron.getPlayerStats().setAppearances(264);
		lebron.getPlayerStats().setScores(9);
		
		
		db.addPlayer( robinho);
		db.addPlayer( ilhan);
		db.addPlayer( maria);
	}
	
	public void perform( SoccerDatabase db) {

		System.out.println("soccer load");
		//1
		SoccerPlayer robinho = new SoccerPlayer("Robinho", LocalDate.of(1980, Month.JANUARY, 25), Nationality.TURKEY);
		robinho.setPicture( new KangalPicture("robinho.jpeg"));
		robinho.getPlayerStats().setAppearances(3522);
		robinho.getPlayerStats().setScores(25);
		
		//2
		SoccerPlayer ilhan = new SoccerPlayer("İlhan Mansız", LocalDate.of(1984, Month.JANUARY, 25), Nationality.GERMANY);
		ilhan.setPicture( new KangalPicture("mansiz.jpeg"));
		ilhan.getPlayerStats().setAppearances(123);
		ilhan.getPlayerStats().setScores(2);
		
		
		db.addPlayer( robinho);
		db.addPlayer( ilhan);

	}
	
	public void perform( BasketballDatabase db) {

		System.out.println("basketball load");
		
		BasketballPlayer lebron = new BasketballPlayer("Lebro James", LocalDate.of(1983, Month.JANUARY, 25), Nationality.ENGLAND);
		lebron.setPicture(new KangalPicture("lebron.jpeg"));
		lebron.getPlayerStats().setAppearances(264);
		lebron.getPlayerStats().setScores(9);
		lebron.getPlayerStats().setThreePPerGame(786);
		
		BasketballPlayer yigit = new BasketballPlayer("yigit", LocalDate.of(1983, Month.JANUARY, 25), Nationality.ENGLAND);
		yigit.setPicture(new KangalPicture("robinho.jpeg"));
		yigit.getPlayerStats().setAppearances(2);
		yigit.getPlayerStats().setScores(4);
		

		db.addPlayer( lebron);
		db.addPlayer( yigit);
	}
	
	public void perform( TennisDatabase db) {

		System.out.println("tennis load");
		//1
		TennisPlayer robinho = new TennisPlayer("Robinho", LocalDate.of(1980, Month.JANUARY, 25), Nationality.TURKEY);
		robinho.setPicture( new KangalPicture("robinho.jpeg"));
		robinho.getPlayerStats().setAppearances(3522);
		robinho.getPlayerStats().setScores(25);
		
		//3
		TennisPlayer maria = new TennisPlayer("Maria Sharapova", LocalDate.of(1983, Month.JANUARY, 25), Nationality.ENGLAND);
		maria.setPicture( new KangalPicture("sharapova.jpeg"));
		maria.getPlayerStats().setAppearances(634);
		maria.getPlayerStats().setScores(4);
		
		
		db.addPlayer( robinho);
		db.addPlayer( maria);
	}
}