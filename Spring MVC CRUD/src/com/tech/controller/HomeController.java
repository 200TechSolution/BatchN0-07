package com.tech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.sun.org.glassfish.gmbal.ManagedAttribute;
import com.tech.model.Student;
import com.tech.serviceI.MyServiceI;



@Controller
public class HomeController {
	
	@Autowired
	MyServiceI si;
	
	@RequestMapping("/reg")
	String saveData(@ModelAttribute Student stu)
	{
		
	   String s=si.saveData(stu);
		
	   System.out.println(s);
	   
		return "index";
		
		        
	}
	
	@RequestMapping("/log")
	public String getSingleStudent(
			@RequestParam("userName")String us,
			@RequestParam("password")String pw,
			Student s,Model m){
		if(us.equals("admin")&& pw.equals("tech"))
		{
			System.out.println("Hello Spring");
			List<Student>stu= si.getStudent(us, pw);
			m.addAttribute("data",stu);
			
			for(Student s1:stu)
			{
				System.out.println(s1.getSid());
				System.out.println(s1.getSname());
			}
			
			return "success";
			
		}
		
		else if(us.equals(us) && pw.equals(pw))
		{
			List<Student>stu= si.getStudent(us, pw);
			m.addAttribute("data",stu);
			return "success";
			
		}
			
		return "index";
		
	}
	
	

}
