package com.setter.secondary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		
		ApplicationContext ap= new ClassPathXmlApplicationContext("ssecondary.xml");
		
		                Student stu=(Student)   ap.getBean("ss");
		                
		                System.out.println(stu.getSid());
		                System.out.println(stu.getSname());
		                System.out.println(stu.getAddrs().getAreaname());
		                System.out.println(stu.getAddrs().getCity());
		                System.out.println(stu.getAddrs().getPincode());
	}

}
