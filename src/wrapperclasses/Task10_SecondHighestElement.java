package wrapperclasses;

import java.util.Arrays;

public class Task10_SecondHighestElement {

    public static void main(String[] args) {
        Integer[] marks = {85, 92, 76, 88, 90};

        System.out.println("Original array: " + Arrays.toString(marks));

        // Ensure the array has at least two elements
        if (marks.length < 2) {
            System.out.println("Cannot find the second highest value in an array with fewer than two elements.");
            return;
        }

        // Sort using Arrays.sort() which internally uses compareTo() 
        Arrays.sort(marks);

        // Get the second highest value 
        Integer secondHighest = marks[marks.length - 2];

        System.out.println("Sorted Marks: " + Arrays.toString(marks));
        System.out.println("Second Highest: " + secondHighest);
    }
}