package comConstuctor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainapp {

	public static void main(String[] args) {
		

	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	Employees emp=(Employees) context.getBean("employees");
	System.out.println(emp);
}
}