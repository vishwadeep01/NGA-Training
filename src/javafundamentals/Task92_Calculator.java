package javafundamentals;

import java.util.Scanner;

public class Task92_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("\nSelect Operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice: ");
        int operationChoice = scanner.nextInt();

        switch (operationChoice) {
            case 1:
                int sum = firstNumber + secondNumber;
                System.out.println("Result (Addition): " + sum);
                break;

            case 2:
                int difference = firstNumber - secondNumber;
                System.out.println("Result (Subtraction): " + difference);
                break;

            case 3:
                int product = firstNumber * secondNumber;
                System.out.println("Result (Multiplication): " + product);
                break;

            case 4:
                if (secondNumber != 0) {
                    int quotient = firstNumber / secondNumber;
                    System.out.println("Result (Division): " + quotient);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid choice. Please select a valid operation (1-4).");
                break;
        }

        scanner.close();
	}

}
