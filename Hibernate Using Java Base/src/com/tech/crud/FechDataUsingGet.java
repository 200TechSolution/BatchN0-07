package com.tech.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tech.util.HibernateUtil;

public class FechDataUsingGet 
{

	public static void main(String[] args) 
	{
		 SessionFactory sf=HibernateUtil.getSessionFactory();
		   
		   Session session=sf.openSession();
		   
		   //get() s>> 1
//		   
//		Student stu= session.get(Student.class,101);
//		System.out.println(stu);
//		 
		   
		   //S >>2
		Student stu1=session.get(Student.class,101);
		System.out.println(stu1);
		
		Student stu2=session.get(Student.class,101);
		System.out.println(stu2);
		   
		//2nd time get method return object from sessison catche
		// so 2nd time for same data get() not execute Query
		
		//S>>3
		
		Student stu3=session.get(Student.class,101);
		   //get method execute Query
		   
		
//		//load() S>>1
//		Student stu1=session.load(Student.class,101);
//		System.out.println(stu1);
//		
//		Student stu2=session.load(Student.class,101);
//		System.out.println(stu2);
//		   
//		//S>>2
//		
//		Student stu3=session.load(Student.class,101);
//		   //load method doesnt execute Query
//		   
		   
	}
}
