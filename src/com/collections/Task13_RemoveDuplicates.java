package com.collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Task13_RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("C");
        languages.add("Java");
        languages.add("Python");

        // Use LinkedHashSet to remove duplicates 
        Set<String> uniqueLanguages = new LinkedHashSet<>(languages);

        // Convert back to list 
        List<String> result = new ArrayList<>(uniqueLanguages);
        
        System.out.println("After removing duplicates: " + result);

	}

}
