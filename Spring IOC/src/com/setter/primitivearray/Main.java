package com.setter.primitivearray;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ap=
			new ClassPathXmlApplicationContext("primitivearry.xml");
		 Student s=(Student)  ap.getBean("spa");
		 
		 System.out.println(s.getSid());
		 System.out.println(s.getSname());
		 
		 String []st=s.getMono();
		 
		 for(int i=0;i<st.length;i++)
		 {
			 System.out.println(st[i]);
		 }
	}
}
