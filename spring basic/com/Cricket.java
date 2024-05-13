package com;

public class Cricket implements Coach{

	private MatchTime matchTime;
	

	public Cricket(MatchTime matchTime) {
		super();
		this.matchTime = matchTime;
	}
	@Override
	public String toString() {
		return "Cricket [matchTime=" + matchTime + "]";
	}
	
	
	public String GetWorkOut() {
		// TODO Auto-generated method stub
		return "Cricket : Running";
	}

	public String GetDiet() {
		// TODO Auto-generated method stub
		return "Cricket : Veg";
	}

	public String getMatchTime() {
		// TODO Auto-generated method stub
		return matchTime.getMatchTime();
	}

	public void setMatchTime(MatchTime matchTime) {
		this.matchTime = matchTime;
	}
}
