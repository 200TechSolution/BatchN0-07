package com.tech.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;



@Entity

@Table(name="Student_Data")
public class Student 
{
	
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
 @Column(name = "Student_name")
  private String sname;
  private String address;
  @Transient
  private String mono;
  private String email;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getMono() {
	return mono;
}
public void setMono(String mono) {
	this.mono = mono;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
  
  
}
