package com.tech.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import com.tech.model.Student;



@Controller
public class HomeController {
	
	@RequestMapping("/log")
	String saveData()
	{
		System.out.println("Hello Spring");
		
		return "index.jsp";
		
		        
	}

}
