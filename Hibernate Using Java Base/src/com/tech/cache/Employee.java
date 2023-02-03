package com.tech.cache;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee
{
	@Id
  private int Eid;
  private String Ename;
public int getEid() {
	return Eid;
}
public void setEid(int Eid) {
	this.Eid = Eid;
}
public String getEname() {
	return Ename;
}
public void setEname(String Ename) {
	this.Ename = Ename;
}
  
  
  
}
