package com.tech.cache;



import java.util.Date;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
public class Employee
{
	@Id
  private int Eid;
	
  private String Ename;
  
  @Transient
  private int x;
  
  
  @Temporal(TemporalType.DATE)
  private Date date;
  
  @Lob
  private byte[] image;

public int getEid() {
	return Eid;
}

public void setEid(int eid) {
	Eid = eid;
}

public String getEname() {
	return Ename;
}

public void setEname(String ename) {
	Ename = ename;
}

public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}

public Date getDate() {
	return date;
}

public void setDate(Date date) {
	this.date = date;
}

public byte[] getImage() {
	return image;
}

public void setImage(byte[] image) {
	this.image = image;
}
  
  
  
}
