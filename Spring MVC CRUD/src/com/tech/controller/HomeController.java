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
			System.out.println("hello Admin");
			List<Student>stu= si.getAllStudents();
			m.addAttribute("data",stu);
			
			return "success";
			
		}
		
		else if(us.equals(us) && pw.equals(pw))
		{
			if(us!="admin"&& pw!="tech")
			{
				return "error";
			}
			else
			{
			System.out.println("for single STudent");
			List<Student>stu= si.getStudent(us, pw);
			m.addAttribute("data",stu);
			return "success";
			}
			
		}
		
		
		return "index";
			
		
		
	}
	
	@RequestMapping("/delete")
	public String deleteStudent(@RequestParam("rd")String id,Model m)
	{
		System.out.println(id);
		si.deleteStudent(id);
		
       List<Student>stu=si.getAllStudents();
       m.addAttribute("data",stu);
		return "success";
	}
	
	@RequestMapping("/update")
	public String updateStudent()
	{
		System.out.println("hello Update Student");
		return null;
		
	}
	

}
