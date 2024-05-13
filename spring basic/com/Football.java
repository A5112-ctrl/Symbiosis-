package com;

public class Football implements Coach{

	@Override
	public String toString() {
		return "Football [matchTime=" + matchTime + "]";
	}

	
	public Football(MatchTime matchTime) {
		super();
		this.matchTime = matchTime;
	}


	private MatchTime matchTime;
	
	public void setMatchTime(MatchTime matchTime) {
		this.matchTime = matchTime;
	}

	public String GetWorkOut() {
		// TODO Auto-generated method stub
		return "Footbal :Playing ";
	}

	public String GetDiet() {
		// TODO Auto-generated method stub
		return "Footbal : Non-Veg";
	}

	public String getMatchTime() {
		// TODO Auto-generated method stub
		return matchTime.getMatchTime();
	}

}
