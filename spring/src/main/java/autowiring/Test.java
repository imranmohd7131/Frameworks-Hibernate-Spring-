package autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("autowiring/config.xml");
	College clg=(College) context.getBean("college");
	System.out.println(clg);
}
}
