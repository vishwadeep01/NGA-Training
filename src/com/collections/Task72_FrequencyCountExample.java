package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task72_FrequencyCountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C++");
        list.add("Java");

        int count = Collections.frequency(list, "Java");
        System.out.println("Frequency of 'Java': " + count);
	}

}
