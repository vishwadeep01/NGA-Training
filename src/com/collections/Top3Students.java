package com.collections;

import com.collections.comparable.Task51_Student;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Top3Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Task51_Student> students = Arrays.asList(
	            new Task51_Student("Alice", 85),
	            new Task51_Student("Bob", 92),
	            new Task51_Student("Charlie", 88),
	            new Task51_Student("David", 91),
	            new Task51_Student("Eve", 79)
	        );

	        // Max heap based on marks
	        PriorityQueue<Task51_Student> maxHeap = new PriorityQueue<>(
	            (s1, s2) -> Integer.compare(s2.marks, s1.marks)
	        );

	        maxHeap.addAll(students);

	        System.out.println("Top 3 scoring students:");
	        for (int i = 0; i < 3 && !maxHeap.isEmpty(); i++) {
	            System.out.println(maxHeap.poll());
	        }
	}

}
