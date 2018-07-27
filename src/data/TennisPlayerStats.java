package data;

public class TennisPlayerStats extends PlayerStats {
	private int doublePlayStat;
	private int aces;
	private int doubleFaults;
	public int getDoublePlayStat() {
		return doublePlayStat;
	}
	public void setDoublePlayStat(int doublePlayStat) {
		this.doublePlayStat = doublePlayStat;
	}
	public int getAces() {
		return aces;
	}
	public void setAces(int aces) {
		this.aces = aces;
	}
	public int getDoubleFaults() {
		return doubleFaults;
	}
	public void setDoubleFaults(int doubleFaults) {
		this.doubleFaults = doubleFaults;
	}
}
