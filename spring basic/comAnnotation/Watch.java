package comAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Watch implements Shop{
	
	@Autowired
	public Watch(@Qualifier("openshop")ShopTime shoptime) {
		super();
		this.shoptime = shoptime;
	}

	private ShopTime shoptime;
	
	public void setShoptime(ShopTime shoptime) {
		this.shoptime = shoptime;
	}

	public String getShoptime() {
		return shoptime.getShoptime();
	}

	public String Getprice() {
		// TODO Auto-generated method stub
		return "Watch :4000";
	}

	public String GetBrand() {
		// TODO Auto-generated method stub
		return "Watch :Sonata ";
	}

}
