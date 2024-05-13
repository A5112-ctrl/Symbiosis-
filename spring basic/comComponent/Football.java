package comComponent;

public class Football implements Coach{

	private Matchtime matchtime;
	
	public void setMatchtime(Matchtime matchtime) {
		this.matchtime = matchtime;
	}

	public String getMatchtime() {
		return matchtime.getMatchtime();
		// TODO Auto-generated method stub
		
	}

	public void GetWorkout() {
		System.out.println("Football :Running");
		
	}

	public void GetDiet() {
		System.out.println("Football :Non Veg");
	}

}
