package com.relationship.maytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tech.util.HibernateUtil;

public class Main {

	public static void main(String[] args) 
	{
		SessionFactory sf=HibernateUtil.getSessionFactory();
		
		Session session=sf.openSession();
//		
//		EMployees e1=new EMployees();
//		          e1.setEid("E_101");
//		          e1.setEname("AMol Aghav");
//		        
//		          
//	    EMployees e2=new EMployees();
//		           e2.setEid("E_102");
//		           e2.setEname("Vikas Chavan");
//		           
//		Project p1=new Project();
//		          p1.setPid("P_001");
//		          p1.setPname("Bank Project");
//		         
//	    Project p2=new Project();
//		           p2.setPid("P_002");
//		           p2.setPname("EDP Project");
//		           
//		List<EMployees>elist=new ArrayList<EMployees>();
//		 
//		List<Project>plist=new ArrayList<Project>();
//		
//            elist.add(e1);
//            elist.add(e2);
//            
//            plist.add(p1);
//            plist.add(p2);
//            
//       e1.setProjects(plist);
//       
//       p1.setEmployee(elist);
//       
//       session.save(e1);
//       session.save(e2);
//       session.save(p1);
//       session.save(p2);
//       
		
	Project pro=	session.get(Project.class,"P_001");
	System.out.println(pro.getPid());
	System.out.println(pro.getPname());
	
	for(EMployees emp:pro.getEmployee())
	{
		System.out.println(emp.getEid());
		System.out.println(emp.getEname());
	//	System.out.println(p.getEmployee());
	}
	
	
	
       Transaction tx=session.beginTransaction();
       tx.commit();
            
            
	}

}
