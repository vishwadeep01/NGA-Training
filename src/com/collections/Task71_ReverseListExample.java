package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task71_ReverseListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("Ruby");

        System.out.println("Original list: " + languages);

        Collections.reverse(languages);

        System.out.println("Reversed list: " + languages);
	}

}
