package com.tech.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.daoi.DaoI;
import com.tech.model.Student;
import com.tech.serviceI.MyServiceI;

@Service
public class MyServiceImpl implements MyServiceI {

	@Autowired
	DaoI daoi;
	
	@Override
	public String saveData(Student stu) {
		
		
		return daoi.saveData(stu);
	}

	@Override
	public List<Student> getStudent(String userName, String Password) {
		
		return daoi.getStudent(userName, Password);
	}

	@Override
	public List<Student> getAllStudents() {
		
		return daoi.getAllStudents();
	}

	@Override
	public String deleteStudent(String id) {
		
		return daoi.deleteStudent(id);
	}

	@Override
	public Student editData(String id) {
		
		return daoi.editData(id);
	}

}
