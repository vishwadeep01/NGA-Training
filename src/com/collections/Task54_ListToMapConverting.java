package com.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.collections.comparable.Task54_Student;

public class Task54_ListToMapConverting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Task54_Student> studentList = Arrays.asList(
	            new Task54_Student("S101", "Alice"),
	            new Task54_Student("S102", "Bob"),
	            new Task54_Student("S103", "Charlie")
	        );

	        Map<String, Task54_Student> studentMap = new HashMap<>();

	        for (Task54_Student student : studentList) {
	            studentMap.put(student.getId(), student);
	        }

	        // Print the map
	        for (Map.Entry<String, Task54_Student> entry : studentMap.entrySet()) {
	            System.out.println(entry.getKey() + " => " + entry.getValue());
	        }
	}

}
