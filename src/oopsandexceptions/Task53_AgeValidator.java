package oopsandexceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task53_AgeValidator {

    // The 'throws' keyword indicates this method might throw this specific exception.
    public static void validateAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Access denied: You must be at least 18 years old.");
        } else {
            System.out.println("Access granted: You are old enough.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Please enter your age: ");
            int userAge = scanner.nextInt();
            
            validateAge(userAge);
            
        } catch (ArithmeticException e) {
            System.err.println("Validation Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.err.println("Input Error: Please enter a valid integer for age.");
        } finally {
            // Ensures the scanner is closed to prevent resource leaks.
            scanner.close();
            System.out.println("\nProgram has finished processing.");
        }
    }
}
