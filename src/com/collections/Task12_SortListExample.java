package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task12_SortListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<>();

        // Add sample integers
        numbers.add(25);
        numbers.add(10);
        numbers.add(45);
        numbers.add(5);
        numbers.add(30);

        System.out.println("Original List: " + numbers);

        // Sort in ascending order
        Collections.sort(numbers);
        System.out.println("Ascending Order: " + numbers);

        // Sort in descending order
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending Order: " + numbers);
	}

}
