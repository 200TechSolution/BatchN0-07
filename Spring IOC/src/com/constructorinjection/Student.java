package com.constructorinjection;

public class Student {

	
	private int sid;
	private String sname;
	
	public Student(int sid, String sname) {
	
		this.sid = sid;
		this.sname = sname;
	}
	
	void  display()
	{
		System.out.println("Stuent Id:"+sid);
		System.out.println("Student Name:"+sname);
	}
	
	
}
