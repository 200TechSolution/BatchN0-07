package com.tech.embedable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tech.util.HibernateUtil;

public class Main {
	
	public static void main(String[] args) {
		
		SessionFactory sf=HibernateUtil.getSessionFactory();
		
		Session session=sf.openSession();
		
		Student s=new Student();
		        s.setSid(101);
		        s.setSname("AMol Aghav");
		        
		 Certificate c=new Certificate();
		             c.setCourse("JAVA");
		             c.setDiration("4 Month");
		             
		             s.setCertificate(c);
		      
		      
		  Student s1=new Student();
		           s1.setSid(102);
		           s1.setSname("Vishal Dhandre");
		           s1.setCertificate(c);
		
		           session.save(s);
		           session.save(s1);
		           
		           session.beginTransaction().commit();
		         
		           session.close();
		      
		
		
		
		
		
	}

}
