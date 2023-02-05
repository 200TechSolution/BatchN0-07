package com.hql.querys;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student 
{
	@Id
	private int sid;
	private String sname;
	private String mono;
	private String adddrs;
	public int getSid() {
		return sid;
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
	public String getMono() {
		return mono;
	}
	public void setMono(String mono) {
		this.mono = mono;
	}
	public String getAdddrs() {
		return adddrs;
	}
	public void setAdddrs(String adddrs) {
		this.adddrs = adddrs;
	}
	

}
