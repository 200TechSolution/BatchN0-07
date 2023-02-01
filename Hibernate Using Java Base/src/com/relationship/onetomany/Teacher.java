package com.relationship.onetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Teacher 
{
	@Id
   private String tid;
   private String tname;
   
   @OneToMany(mappedBy="teacher")
   private List<Student> students;

public String getTid() {
	return tid;
}

public void setTid(String tid) {
	this.tid = tid;
}

public String getTname() {
	return tname;
}

public void setTname(String tname) {
	this.tname = tname;
}

public List<Student> getStudents() {
	return students;
}

public void setStudents(List<Student> students) {
	this.students = students;
}

@Override
public String toString() {
	return  tid + ", tname=" + tname + ", students=" + students ;
}
   
}
