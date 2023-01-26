package com.tech.crud;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.tech.util.HibernateUtil;

public class Operation 
{
	   SessionFactory sf=HibernateUtil.getSessionFactory();
	   
	   Session session=sf.openSession();
	   
	   Transaction tx=null;
	   
	   Scanner sc=new Scanner(System.in);
	   
	
	public void insertData()
	{
		
		try
		{
		System.out.println("Enter the Student ID");
		int id=sc.nextInt();
		
		System.out.println("Enter Student Name");
	    String name=  sc.next();
		    
	    System.out.println("Enter Student Address");
		String addrs= sc.next();
		
		System.out.println("Enter Student Email");
	    String email=	sc.next();
	    
	    Student stu=new Student();
	            stu.setSid(id);
	            stu.setSname(name);
	            stu.setAddrs(addrs);	
	            stu.setEmail(email);
	            
	      session.save(stu);
	       tx=session.beginTransaction();
	       tx.commit(); 
		}
		catch (Exception e) 
		{
			System.out.println("Invalied Input Please try Again");
			
		}
	       
	      
	}
	
	public void getData()
	{
		try
		{
		System.out.println("Enter Student Id");
		
		  int id=sc.nextInt();
		  
		  Student stu=session.get(Student.class,id);
		  
		  System.out.println(stu.getSid());
		  System.out.println(stu.getSname());
		  System.out.println(stu.getAddrs());
		  System.out.println(stu.getEmail());
		  tx=session.beginTransaction();
		  tx.commit();
		}
		catch (Exception e) 
		{
			System.out.println("Invalied Student Id please Re-Enter Student Id");
			if(tx!=null)
			{
				System.out.println("In tx rollback");
				tx.rollback();
			}
		}
	}
	
	
	public void deleteData()
	{
		System.out.println("Enter Student Id ");
		 
		   int id= sc.nextInt();
		   Student s=session.get(Student.class,id);
		   session.delete(s);
		   session.beginTransaction().commit();
		 
		   
		   System.out.println("Data is Deleted Successfully from Database");
	}
	

	public void getAllData()
	{
		
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		 
		  
		List<Student>studentList= session.createQuery("from Student").list();
		
		for(Student stu:studentList)
		{
			System.out.println(stu.getSid());
			System.out.println(stu.getSname());
			System.out.println(stu.getAddrs());
			System.out.println(stu.getEmail());
			System.out.println("********************");
			
		}
		
		session.close();
		
		
	}
	
		public void updateData()
		{
			Session session=HibernateUtil.getSessionFactory().openSession();
			
			tx=session.beginTransaction();
			
			System.out.println("Enter the Sudent Id");
			int  id= sc.nextInt();
			
		Query hql=session.createQuery("update Student set sname=:s  where sid=:r");
		
		System.out.println("Enter the Student Name");
		 String uname= sc.next();
		
		hql.setParameter("s",uname);
		hql.setParameter("r", id);
		hql.executeUpdate();
		
		tx.commit();
		
		System.out.println("Record Updated Successfully");
		}
	
}
