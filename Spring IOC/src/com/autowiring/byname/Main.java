package com.autowiring.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ap=
				new ClassPathXmlApplicationContext("autowring_byName.xml");
		
	     Student stu=(Student)ap.getBean("s");
	     
	     System.out.println(stu.getSid());
	     System.out.println(stu.getSname());
	     System.out.println(stu.getAddrs().getAreaName());
	     System.out.println(stu.getAddrs().getCity());
	}

}
