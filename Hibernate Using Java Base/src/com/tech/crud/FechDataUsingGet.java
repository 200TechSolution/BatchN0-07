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
		   
		   //get()
		   
		Student stu=   session.get(Student.class,101);
		System.out.println(stu);
		   
		   
		   
	}
}
