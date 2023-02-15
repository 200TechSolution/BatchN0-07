package com.setter.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		
		ApplicationContext ap=
		new ClassPathXmlApplicationContext("settercollection.xml");
		
		  MyClass mc=(MyClass) ap.getBean("sc");
		  
		  
		  System.out.println(mc.getMyList());
		  
		  System.out.println( mc.getMySet());
		  System.out.println(mc.getMyMap());
		 
		  
		

	}

}
