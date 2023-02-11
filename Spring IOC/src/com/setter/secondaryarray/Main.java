package com.setter.secondaryarray;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	
	public static void main(String[] args) {
		
		
	ApplicationContext ap=
	   new ClassPathXmlApplicationContext("secondaryarray.xml"); 
	              
	Student s=(Student)ap.getBean("sa");
	
		System.out.println(s.getSid());
		System.out.println(s.getSname());
		
	 Mono[] mob=s.getMono();
	 for(int i=0;i<mob.length;i++)
	 {
		 System.out.println(mob[i].getMobno());
	 }
	
	}
}
