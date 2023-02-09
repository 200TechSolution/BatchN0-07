package com.lazy_egger.singleton;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
	
	public static void main(String[] args) 
	{
		
		System.out.println("Main");
		//Resource rs=new ClassPathResource("L_EsingletonwithApplicationc.xml");
		
		//BeanFactory b=new XmlBeanFactory(new ClassPathResource("L_EsingletonwithApplicationc.xml"));
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("L_EsingletonwithApplicationc.xml");
		System.out.println("After BeanFactory");
		    
		Welcome wel=(Welcome) ap.getBean("w");
		        wel.display();
	}

}
