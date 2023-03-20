package firstSpring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource r = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		
		Employee emp = (Employee) factory.getBean("empbean");
		System.out.println(emp);
	}

}
