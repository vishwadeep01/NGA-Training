package com.collections.comparable;

public class Task54_Student {
	private String id;
    private String name;
	public Task54_Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	
	public String getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
    
    
}
