package com.relationship.maytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	
	@Id
	private String pid;
	private String pname;
	
	@ManyToMany
	@JoinTable(name="EMp_pro",
	 joinColumns = {@JoinColumn(name="pid")},
	 inverseJoinColumns = {@JoinColumn(name="eid")})
	private List<EMployees>employee;

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public List<EMployees> getEmployee() {
		return employee;
	}

	public void setEmployee(List<EMployees> employee) {
		this.employee = employee;
	}
	

}
