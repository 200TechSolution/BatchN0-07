package com.tech.cache;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;



import org.hibernate.Session;
import org.hibernate.SessionFactory;


import com.tech.util.HibernateUtil;



public class Main {
	
	
	public static void main(String[] args) throws IOException {
		
	
	SessionFactory sf=HibernateUtil.getSessionFactory();
	
	
	Session session=sf.openSession();
	Session session1=sf.openSession();
	
  //  Employee e=new Employee();
//    
//             e.setEid(101);
//             e.setEname("AMol Aghav");
//             
//             session.save(e);
//             session.beginTransaction().commit();
//             
             
    //2nd level Cache
//     Employee emp= session.get(Employee.class,101);
//          System.out.println(emp.getEid());
//          
//          session.close();
//          sf.close();
//          
//          Employee emp1= session1.get(Employee.class,101);
//          System.out.println(emp1.getEid());
//         Employee emp1= session1.get(Employee.class,101);
//         System.out.println(emp.getEid());
//    
//          session1.close();
//        
    
	
	//for more Annotations like save Image etc
	
	    Employee e=new Employee();
	    e.setEid(101);
	    e.setEname("Amol A.");
	    e.setDate(new Date());
	    e.setX(123654);
   
    
		FileInputStream file=new FileInputStream("src/img.png") ;   
		byte[] data=new byte[file.available()];
		file.read(data);
		e.setImage(data);
		
		session.save(e);
		session.beginTransaction().commit();
		session.close();
    
	}        
}