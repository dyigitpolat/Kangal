package data;

public class BasketballPlayerStats extends PlayerStats {
	private int rebounds;
	private double minsPerGame;
	private double fGoalPerGame;
	private double threePPerGame;
	public int getRebounds() {
		return rebounds;
	}
	public void setRebounds(int rebounds) {
		this.rebounds = rebounds;
	}
	public double getMinsPerGame() {
		return minsPerGame;
	}
	public void setMinsPerGame(double minsPerGame) {
		this.minsPerGame = minsPerGame;
	}
	public double getfGoalPerGame() {
		return fGoalPerGame;
	}
	public void setfGoalPerGame(double fGoalPerGame) {
		this.fGoalPerGame = fGoalPerGame;
	}
	public double getThreePPerGame() {
		return threePPerGame;
	}
	public void setThreePPerGame(double threePPerGame) {
		this.threePPerGame = threePPerGame;
	}
}
