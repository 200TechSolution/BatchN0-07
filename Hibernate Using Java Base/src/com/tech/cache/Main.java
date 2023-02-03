package com.tech.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tech.util.HibernateUtil;

public class Main {
	public static void main(String[] args) {
		
	
	SessionFactory sf=HibernateUtil.getSessionFactory();
	
	Session session=sf.openSession();
	Session session1=sf.openSession();
	
    Employee e=new Employee();
//    
//             e.setEid(101);
//             e.setEname("AMol Aghav");
//             
//             session.save(e);
//             session.beginTransaction().commit();
//             
             
     Employee emp= session.get(Employee.class,101);
          System.out.println(emp.getEid());
          
          
          Employee emp1= session1.get(Employee.class,101);
          System.out.println(emp1.getEid());
//          Employee emp1= session1.get(Employee.class,101);
//          System.out.println(emp.getEid());
    
          
	}        
}