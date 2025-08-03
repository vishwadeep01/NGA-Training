package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task33_SortMapByKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> students = new HashMap<>();
        students.put(104, "Amit");
        students.put(101, "Ravi");
        students.put(103, "Sneha");
        students.put(102, "Priya");

        // Sort by keys using TreeMap
        //TreeMap sort the values by default
        TreeMap<Integer, String> sortedMap = new TreeMap<>(students);

        System.out.println("Sorted Map by Keys: " + sortedMap);
	}

}
