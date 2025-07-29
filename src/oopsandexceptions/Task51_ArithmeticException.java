package oopsandexceptions;

import java.util.Scanner;

public class Task51_ArithmeticException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter a number to divide 100 by: ");
            int number = scanner.nextInt();
            
            double result = 100.0 / number;
            
            // check if the result is infinity
            if (Double.isInfinite(result)) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            
            System.out.println("Result: " + result);
            
        } catch (ArithmeticException e) {         
            System.out.println("Error: Cannot divide by zero. Please enter a non-zero number.");
        }
    }
}

