package com.collections;

import java.util.Set;
import java.util.TreeSet;

public class Task22_SortedSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TreeSet is a sorted set in Java. It stores elements in ascending natural 
		// order by default
		Set<Integer> numbers = new TreeSet<>();

        numbers.add(25);
        numbers.add(10);
        numbers.add(50);
        numbers.add(5);
        numbers.add(30);
        
        System.out.println("Sorted numbers: " + numbers);
	}

}
