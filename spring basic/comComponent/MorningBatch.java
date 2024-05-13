package comComponent;

import org.springframework.stereotype.Component;

@Component("mrn")
public class MorningBatch implements Matchtime{

	public String getMatchtime() {
		return "Morning Time : 10 A.M";
	}

	
	
}
