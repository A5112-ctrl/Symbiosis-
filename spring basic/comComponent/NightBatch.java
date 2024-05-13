package comComponent;

import org.springframework.stereotype.Component;

@Component("ngt")
public class NightBatch  implements Matchtime{

	public String getMatchtime() {
		return "Night Time : 9 P.M";
	}


}
