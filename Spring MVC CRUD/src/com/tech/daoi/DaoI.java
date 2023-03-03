package com.tech.daoi;

import java.util.List;

import com.tech.model.Student;

public interface DaoI {

	
	public String saveData(Student stu);
	
	public List<Student> getStudent(String userName,String Password);
	
	public List<Student>getAllStudents();
	
	public String deleteStudent(String id);
	
	public Student   editData(String id);
}
