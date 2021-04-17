package com.manish.java.projects.SpringBootWebappDemo.MySecondWebDBProject.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student 
{
	@Id
	private int sid ;
	private String sname ;
	private int sage ;
	
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
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	
	@Override
	public String toString() {
		return "Student [ID=" + sid + ", Name=" + sname + ", Age=" + sage + "]";
	}
	
	

}
