package wrapperclasses;

import java.util.ArrayList;
import java.util.List;

public class Task2_AutoboxingUnboxingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double sum = 0.0;
		 double average = 0.0;
		 List<Double> marks = new ArrayList<>();

	        marks.add(87.5);
	        marks.add(92.0);
	        marks.add(76.75);
	        marks.add(88.25);

	        System.out.println("List of marks: " + marks);

	        
	        // Unboxing automatically converts the Double object to a primitive double
	        // for the arithmetic operation.
	        for (Double grade : marks) {
	            sum += grade;
	        }
	        average = sum / marks.size();

	        System.out.println("Sum of all marks: " + sum);
	        System.out.println("Calculated average: " + average);
	}

}

       
