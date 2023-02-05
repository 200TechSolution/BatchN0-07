package com.tech.embedable;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
	
	private String course;
	private String diration;
	
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDiration() {
		return diration;
	}
	public void setDiration(String diration) {
		this.diration = diration;
	}
	
	

}
