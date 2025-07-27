package javafundamentals;

import java.util.Scanner;

public class Task10_1_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] numbers = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        // Loop to calculate sum, min, max
        for (int i = 0; i < 10; i++) {
            sum += numbers[i];

            if (numbers[i] < min) {
                min = numbers[i];
            }

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        
        double average = sum / 10.0;

        System.out.println("\nResults:");
        System.out.println("Average: " + average);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

        scanner.close();
	}

}
