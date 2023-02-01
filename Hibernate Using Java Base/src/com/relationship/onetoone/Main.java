package com.relationship.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tech.util.HibernateUtil;

public class Main {
	
	
	
	public static void main(String[] args) {
		
		
	  SessionFactory sf=HibernateUtil.getSessionFactory();
	   
	   Session session=sf.openSession();
	   //Insert Data
	   Student s=new Student();
	           s.setSid("S_101");
	           s.setSname("Amol Aghav");
	           s.setMono("7020656598");
	           
	   Course c=new Course();
	          c.setCid("C_001");
	          c.setCname("JAVA");
	          c.setStudent(s); 
	          s.setCource(c);
	        
	        session.save(s);
	        session.save(c);
	        
	        session.beginTransaction().commit();
	        
	  //Featch Data
	        
	    Student stu= session.get(Student.class,"S_101");
	    
	    System.out.println(stu.getSid());
	    System.out.println(stu.getSname());
	    System.out.println(stu.getMono());
	    System.out.println(stu.getCource().getCid());
	    System.out.println(stu.getCource().getCname());
	        
//	  Course cr=session.get(Course.class,"C_001");
//	        System.out.println( cr.getCid());
//	        System.out.println(cr.getCname());
//	        System.out.println(cr.getStudent().getSid());
//	        System.out.println(cr.getStudent().getSname());
//	      
	}
}
