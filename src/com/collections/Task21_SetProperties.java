package com.collections;

import java.util.HashSet;
import java.util.Set;

public class Task21_SetProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> subjects = new HashSet<>();
		
		// The HashSet automatically eliminates duplicates
        subjects.add("Math");
        subjects.add("Science");
        subjects.add("English");
        subjects.add("Math");     // duplicate
        subjects.add("Science");  // duplicate
        
        
        //"Math" and "Science" were added twice, they appear only once in the output.
        System.out.println("Subjects in the HashSet: " + subjects);
	}

}
