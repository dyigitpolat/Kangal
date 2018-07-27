package data;

public class SoccerPlayerStats extends PlayerStats {
	private int yellowCards;
	private int redCards;
	private double scorePerGame;
	private int manOfTheMatch;
	private int tackles;
	private int offsides;
	public int getYellowCards() {
		return yellowCards;
	}
	public void setYellowCards(int yellowCards) {
		this.yellowCards = yellowCards;
	}
	public int getRedCards() {
		return redCards;
	}
	public void setRedCards(int redCards) {
		this.redCards = redCards;
	}
	public double getScorePerGame() {
		return scorePerGame;
	}
	public void setScorePerGame(int scorePerGame) {
		this.scorePerGame = scorePerGame;
	}
	public int getManOfTheMatch() {
		return manOfTheMatch;
	}
	public void setManOfTheMatch(int manOfTheMatch) {
		this.manOfTheMatch = manOfTheMatch;
	}
	public int getTackles() {
		return tackles;
	}
	public void setTackles(int tackles) {
		this.tackles = tackles;
	}
	public int getOffsides() {
		return offsides;
	}
	public void setOffsides(int offsides) {
		this.offsides = offsides;
	}
	
}
