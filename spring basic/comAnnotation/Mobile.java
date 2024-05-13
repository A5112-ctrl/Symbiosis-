package comAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Mobile implements Shop{

	private ShopTime shoptime;
	
	@Autowired
	@Qualifier("openShop")
	public void setShoptime(ShopTime shoptime) {
		this.shoptime = shoptime;
	}

	public String getShoptime() {
		// TODO Auto-generated method stub
		return shoptime.getShoptime();
	}

	public String Getprice() {
		// TODO Auto-generated method stub
		return "Mobile : 12000";
	}

	public String GetBrand() {
		// TODO Auto-generated method stub
		return "Mobile : Apple ";
	}

}
