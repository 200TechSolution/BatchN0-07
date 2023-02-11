package com.setter.primitive;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

  public static void main(String[] args) {
	
		
   ApplicationContext ap=new ClassPathXmlApplicationContext("sprimitive.xml");
		 
		    Student stu=(Student)ap.getBean("sp");
		    
		    System.out.println("Student Id:"+stu.getSid());
		    System.out.println("Student Name:"+stu.getSname());

	}

}
