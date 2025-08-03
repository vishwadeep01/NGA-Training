package com.collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class Task31_StudentMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> studentMap = new HashMap<>();

        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");
        studentMap.put(104, "David");
        studentMap.put(105, "Eva");

        // Remove one entry 
        studentMap.remove(103);

        // Iterate using entrySet()
        System.out.println("Student Details:");
        for (Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }
	}

}
