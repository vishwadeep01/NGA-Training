package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.collections.comparable.Task51_Student;

public class Task52_SortingComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Task51_Student> list = new ArrayList<>();
        list.add(new Task51_Student("Charlie", 90));
        list.add(new Task51_Student("Alice", 85));
        list.add(new Task51_Student("Bob", 72));

        // Sort by name using Comparator
        Collections.sort(list, new Comparator<Task51_Student>() {
            @Override
            public int compare(Task51_Student s1, Task51_Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });

        System.out.println("Students sorted by name:");
        for (Task51_Student s : list) {
            System.out.println(s);
        }
	}

}
