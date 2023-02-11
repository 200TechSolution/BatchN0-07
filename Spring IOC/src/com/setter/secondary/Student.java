package com.setter.secondary;

public class Student {
	
	private int sid;
	private String sname;
	
	private Address Addrs;

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

	public Address getAddrs() {
		return Addrs;
	}

	public void setAddrs(Address addrs) {
		Addrs = addrs;
	}

}
