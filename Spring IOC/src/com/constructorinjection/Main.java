package com.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("constructor_primitive.xml");
		  
		    Student stu=(Student)  ap.getBean("s");
		    
		    stu.display();

	}

}
