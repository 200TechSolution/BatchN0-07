package com.tech.daoi;

import java.util.List;

import com.tech.model.Student;

public interface DaoI {

	
	public String saveData(Student stu);
	
	public List<Student> getStudent(String userName,String Password);
}
