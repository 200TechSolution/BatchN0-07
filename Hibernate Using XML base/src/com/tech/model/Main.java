package com.tech.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main 
{
    public static void main(String[] args) 
    {
		
				
		  StandardServiceRegistry registory=new StandardServiceRegistryBuilder().configure().build();
		   MetadataSources msd=new MetadataSources(registory);
		   
		   Metadata md=msd.getMetadataBuilder().build();
		   
		   SessionFactory sf=md.getSessionFactoryBuilder().build();
		   
		   Session session=sf.openSession();
		   
		   Student stu=new Student();
         //  stu.setId(103);
           stu.setSname("Amol");
           stu.setAddress("Vaijapur");
           stu.setEmail("amol123@gmail.com");
           stu.setMono("1236578996");
           
           session.save(stu);
          session.beginTransaction();
           System.out.println("Done");
           sf.close();
           session.close();
           
           
     
  }
}
