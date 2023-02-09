package com.tec.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
	
	public static void main(String[] args)
	{
	
		ApplicationContext ap=new ClassPathXmlApplicationContext("spring.xml");
		
		
		  Welcome wel=(Welcome)ap.getBean("w");
		  System.out.println("First call"+wel);
		  
		  Welcome wel1=(Welcome)ap.getBean("w");
		  System.out.println("Second call"+wel1);
		   
		 
		
		
		
	}

}
