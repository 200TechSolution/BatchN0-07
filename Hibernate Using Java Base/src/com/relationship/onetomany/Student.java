package com.relationship.onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student 
{
  @Id
  private String sid;
  private String sname;
  
  @ManyToOne
  private Teacher teacher;

public String getSid() {
	return sid;
}

public void setSid(String sid) {
	this.sid = sid;
}

public String getSname() {
	return sname;
}

public void setSname(String sname) {
	this.sname = sname;
}

public Teacher getTeacher() {
	return teacher;
}

public void setTeacher(Teacher teacher) {
	this.teacher = teacher;
}

@Override
public String toString() {
	return  sid + ", sname=" + sname + ", teacher=" + teacher ;
}
  
}
