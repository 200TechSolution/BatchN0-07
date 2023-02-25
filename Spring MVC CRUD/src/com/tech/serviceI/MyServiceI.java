package com.tech.serviceI;

import java.util.List;

import com.tech.model.Student;

public interface MyServiceI {
	
	public String saveData(Student stu);
	
	public List<Student> getStudent(String userName,String Password);
	
	
	
}
