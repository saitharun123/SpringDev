package com.fmc.SpringJDBC.model;

import org.springframework.stereotype.Component;

@Component
public class Student {

	private int sid;
	private String name;
	private int marks;
	

	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
}
