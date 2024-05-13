package comAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
	Shop shop=(Shop) context.getBean("mobile",Mobile.class);
	System.out.println(shop.Getprice());
	System.out.println(shop.GetBrand());

	System.out.println(shop.getShoptime());
	}
}
