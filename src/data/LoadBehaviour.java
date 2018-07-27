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
		//1
		SoccerPlayer robinho = new SoccerPlayer("Robinho", LocalDate.of(1980, Month.JANUARY, 25), Nationality.TURKEY);
		robinho.getPlayerStats().setAppearances(3522);
		robinho.getPlayerStats().setScores(25);
		
		//2
		SoccerPlayer ilhan = new SoccerPlayer("İlhan Mansız", LocalDate.of(1984, Month.JANUARY, 25), Nationality.GERMANY);
		ilhan.getPlayerStats().setAppearances(123);
		ilhan.getPlayerStats().setScores(2);
		
		
		db.addPlayer( robinho);
		db.addPlayer( ilhan);
	}
	
	public void perform( BasketballDatabase db) {
		BasketballPlayer lebron = new BasketballPlayer("Lebro James", LocalDate.of(1983, Month.JANUARY, 25), Nationality.ENGLAND);
		lebron.setPicture(new KangalPicture("lebron.jpeg"));
		lebron.getPlayerStats().setAppearances(264);
		lebron.getPlayerStats().setScores(9);

		db.addPlayer( lebron);
	}
	
	public void perform( TennisDatabase db) {
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
}