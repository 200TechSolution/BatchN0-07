package com.relationship.secondaryreference;

import java.util.ArrayList;
import java.util.List;


public class Test {
	
	public static void main(String[] args) 
	{
		List<Student>l=new ArrayList();
		
		AreaName ar=new AreaName();
		         ar.setfName("KarveNagar");
		         ar.setLaneName("Deshmukh Lane");
		         ar.setLaneNo("LK024");
		
		Address a=new  Address();
		        a.setCityName("Pune");
		        a.setAreaName(ar);
                a.setDisName("Pune Dist");	
                a.setPinCode(411058);
                
        Student s=new Student();
                s.setSid(101);
                s.setSname("Amol");
                s.setMono("7896541230");
                s.setAddress(a);
                
         Student s1=new Student();
		         s1.setSid(102);
		         s1.setSname("Ankush");
		         s1.setMono("981441230");
		         s1.setAddress(a);
		         
		         l.add(s);
		         l.add(s1);
		         System.out.println(l);
		         
		      for(Student stu:l)
		      {
		    	  System.out.println(stu.getSid());
		    	  System.out.println(stu.getSname());
		    	  System.out.println(stu.getMono());
		    	  System.out.println(stu.getAddress().getCityName());
		    	  System.out.println(stu.getAddress().getDisName());
		    	  System.out.println(stu.getAddress().getPinCode());
		    	  System.out.println(stu.getAddress().getAreaName().getfName());
		    	  System.out.println(stu.getAddress().getAreaName().getLaneName());
		    	  System.out.println(stu.getAddress().getAreaName().getLaneNo());
		    	  System.out.println("****************************");
		      }
		         
		         
		         
		         
	}

}
