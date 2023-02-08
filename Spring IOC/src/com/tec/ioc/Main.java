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
	//	Resource rs=new ClassPathResource("spring.xml");
		
		//BeanFactory b=new XmlBeanFactory(rs);
		ApplicationContext ap=new ClassPathXmlApplicationContext("spring.xml");
		
		
		  Welcome wel=(Welcome)ap.getBean("w");
		   
		  wel.display();
		
	}

}
