package com.collections;

import java.util.ArrayList;
import java.util.Collections;

import com.collections.comparable.Task51_Student;

public class Task51_Comparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Task51_Student> list = new ArrayList<>();
        list.add(new Task51_Student("Alice", 85));
        list.add(new Task51_Student("Bob", 72));
        list.add(new Task51_Student("Charlie", 90));

        Collections.sort(list); // uses compareTo from Student class

        System.out.println("Sorted students by marks (ascending):");
        for (Task51_Student s : list) {
            System.out.println(s);
        }
	}

}
