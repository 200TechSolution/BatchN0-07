package com.tech.util;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

import com.hql.querys.Student;
import com.relationship.maytomany.EMployees;
import com.relationship.maytomany.Project;

import com.relationship.onetomany.Teacher;





public class HibernateUtil 
{
   private static StandardServiceRegistry registory;
  
   private static SessionFactory sf;
   
    public static SessionFactory   getSessionFactory()
    {
    	Map<String,Object>setting=new HashMap<String, Object>();
    	
    	  setting.put(Environment.DRIVER,"com.mysql.jdbc.Driver");
    	  
    	  setting.put(Environment.URL,"jdbc:mysql://localhost:3306/hqlQuery");
    	  
    	  setting.put(Environment.USER,"root");
    	  
    	  setting.put(Environment.PASS,"root");
    	  
    	  setting.put(Environment.HBM2DDL_AUTO,"update");
    	  
    	  setting.put(Environment.FORMAT_SQL,"true");
    	  
    	  setting.put(Environment.USE_SECOND_LEVEL_CACHE,true);
    	  
    	  setting.put(Environment.CACHE_REGION_FACTORY,"org.hibernate.cache.ehcache.EhCacheRegionFactory");
    	  
    	  setting.put(Environment.SHOW_SQL,"true");
    	  
    	  setting.put(Environment.DIALECT,"org.hibernate.dialect.MySQL55Dialect");
    	  
    	  
    	  
    	 registory=new StandardServiceRegistryBuilder().
    			       applySettings(setting).build();
    	 MetadataSources msd=new MetadataSources(registory).addAnnotatedClass(Student.class);
    			 //addAnnotatedClass(Student.class).addAnnotatedClass(Teacher.class);
    	 Metadata md=msd.getMetadataBuilder().build();
    	 
         sf=md.getSessionFactoryBuilder().build();
         
         return sf;
    	  
    	
    }
}
