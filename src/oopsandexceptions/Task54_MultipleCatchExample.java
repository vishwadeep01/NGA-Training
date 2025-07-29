package oopsandexceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task54_MultipleCatchExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40};

        try {
            System.out.print("Enter an array index to access: ");
            int index = scanner.nextInt();

            System.out.print("Enter a number to divide by: ");
            int divisor = scanner.nextInt();

            System.out.println("Value at index " + index + " is " + numbers[index]);

            int result = numbers[index] / divisor;
            System.out.println("Result of division is: " + result);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: Array index is out of bounds. Please use an index from 0 to " + (numbers.length - 1) + ".");
        
        } catch (ArithmeticException e) {
            System.err.println("Error: Cannot divide by zero.");
        
        } catch (InputMismatchException e) {
            System.err.println("Error: Invalid input. Please enter integers only.");
        
        } finally {
            scanner.close();
            System.out.println("\nProgram execution finished.");
        }
    }
}

