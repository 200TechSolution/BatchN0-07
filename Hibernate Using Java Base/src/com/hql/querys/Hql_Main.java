package com.hql.querys;




import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tech.util.HibernateUtil;

public class Hql_Main 
{
	public static void main(String[] args) {
		
	
   SessionFactory sf=HibernateUtil.getSessionFactory();
   
   Session session=sf.openSession();
   
//   Student s=new Student();
//           s.setSid(103);
//           s.setSname("Harshad Nikam");
//           s.setMono("9595692365");
//           s.setAdddrs("Pune");
//           
//           session.save(s);
//           session.beginTransaction().commit();
//           
//           session.close();
   
       String query="from Student";
     //  String query="from Student where sname= 'Vishal Dhandre'";
       Query<Student> q=  session.createQuery(query);
       List<Student>slist=q.list();
       
       for(Student stu:slist)
       {
    	   System.out.println(stu.getSid());
    	   System.out.println(stu.getSname());
    	   System.out.println(stu.getAdddrs());
    	   System.out.println(stu.getMono());
    	   System.out.println("**************");
       }
       
       session.close();
   
	}
           
}
