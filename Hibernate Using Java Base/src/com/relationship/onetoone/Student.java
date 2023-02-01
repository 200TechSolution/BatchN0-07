package com.relationship.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Student {

	@Id
	private String sid;
	
	private String sname;
	
	private String mono;
	
	@OneToOne
	@JoinColumn(name ="cid")
	private Course cource;
	
	
	public Course getCource() {
		return cource;
	}
	public void setCource(Course cource) {
		this.cource = cource;
	}
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
	public String getMono() {
		return mono;
	}
	public void setMono(String mono) {
		this.mono = mono;
	}
	
	
}
