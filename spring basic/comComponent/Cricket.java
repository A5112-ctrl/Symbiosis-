package comComponent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("crk")
public class Cricket implements Coach{

	private Matchtime matchtime;
	
	@Autowired
	@Qualifier("ngt")
	public void setMatchtime(Matchtime matchtime) {
		this.matchtime = matchtime;
	}

	public String getMatchtime() {
		return matchtime.getMatchtime();
	
	}

	public void GetWorkout() {
		System.out.println("Cricket :Running");
	}

	public void GetDiet() {
		// TODO Auto-generated method stub
		System.out.println("Cricket :Veg");
	}

}
