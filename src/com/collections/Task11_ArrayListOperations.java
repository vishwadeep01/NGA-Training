package com.collections;

import java.util.ArrayList;
import java.util.List;

public class Task11_ArrayListOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> languages = new ArrayList<>();

        // Add 5 elements
        languages.add("Java");
        languages.add("C");
        languages.add("C++");
        languages.add("Ruby");
        languages.add("Python");

        // Remove the 2nd element 
        languages.remove(1);

        // Print the final list
        System.out.println(languages);  
	}

}
