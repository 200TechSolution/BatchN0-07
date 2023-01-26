package com.tech.crud;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	private int sid;
	private String sname;
	private String email;
	private String addrs;
	
	//private Address addrs;
	
	
	public int getSid() {
		return sid;
	}
	@Override
	public String toString() {
		return  sid + ", sname=" + sname + ", email=" + email + ", addrs=" + addrs ;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	
	

}
