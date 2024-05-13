package comComponent;

import javax.naming.Context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
	ApplicationContext context=new ClassPathXmlApplicationContext("configComp.xml");
	Coach ch= context.getBean("crk",Cricket.class);
	ch.GetDiet();
	ch.GetWorkout();
	System.out.println(ch.getMatchtime());
	
	
	//Qulifier is used to tell the autowired which component have to use
	//@Autowired-- it will connect to the next connection with component(Automatic dependency injection)
	//			-- it is used in class which contain component (above setter method)
	//@Qualifier("ngt")
	}
}
