package com.collections.comparable;

public class Task63_Employee {
	String name;
	String dept;
	public Task63_Employee(String name, String dept) {
		super();
		this.name = name;
		this.dept = dept;
	}
	
	public String getDept() {
	    return dept;
	}
	
	@Override
	public String toString() {
		return " name=" + name + ", dept=" + dept ;
	}
	
	
}
