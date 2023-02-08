		package com.tech.embedable;
		
		import javax.persistence.Entity;
		import javax.persistence.Id;
		
		@Entity
		public class Student {
		
			@Id
			
			private int sid;
			private String sname;
			
			private Certificate certificate;
		
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
		
			public Certificate getCertificate() {
				return certificate;
			}
		
			public void setCertificate(Certificate certificate) {
				this.certificate = certificate;
			}
			
		}