package com.relationship.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.relationship.secondaryreference.Test;
import com.tech.util.HibernateUtil;

public class Main {

	public static void main(String[] args)
	{
		SessionFactory sf=HibernateUtil.getSessionFactory();
		
		Session session=sf.openSession();
		
		//Create Data
//		Teacher t=new Teacher();
//		        t.setTid("T_101");
//		        t.setTname("S.Jadhav");
//		        
//		Student s=new Student();
//		        s.setSid("S_001");
//		        s.setSname("Amol Aghav");
//		        s.setTeacher(t);
//
//		Student s1=new Student();
//		        s1.setSid("S_002");
//		        s1.setSname("Vishal Dhandre");
//		        s1.setTeacher(t);
//		        
//		Student s2=new Student();
//		         s2.setSid("S_003");
//		         s2.setSname("Vikas Chavan");
//		         s2.setTeacher(t);
//		         
//		  List<Student>studentList= new ArrayList<Student>();
//		        studentList.add(s);
//		        studentList.add(s1);
//		        studentList.add(s2);
//		        
//		        t.setStudents(studentList);
//		        
//		 
//		  session.save(s);
//		  session.save(s1);
//		  session.save(s2);
//		  session.save(t);  
//		  session.beginTransaction().commit();
//		  
//		  session.close();
//		  
//		         
		     //Featch Data
		
	     Teacher t= session.get(Teacher.class,"T_101");
	     System.out.println(t.getTid());
	     System.out.println(t.getTname());
	  //  System.out.println(t.getStudents());
	      
	      
	      
	      for(Student stu:t.getStudents())
	      {
	    	 
	    	 System.out.println(stu.getSid());
	    	 System.out.println(stu.getSname());
	      }
		        
		        
		
	}
}
