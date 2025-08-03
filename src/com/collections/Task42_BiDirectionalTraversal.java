package com.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Task42_BiDirectionalTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");

        ListIterator<String> iterator = fruits.listIterator();

        System.out.println("Forward traversal:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nBackward traversal:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
	}

}
