package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Task41_RemoveStartingWithA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Ankit");
        names.add("Charlie");
        names.add("Amit");

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.startsWith("A")) {
                iterator.remove(); 
            }
        }

        System.out.println("Names after removal: " + names);
	}

}
