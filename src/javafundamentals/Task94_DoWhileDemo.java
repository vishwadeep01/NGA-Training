package javafundamentals;

import java.util.Scanner;

public class Task94_DoWhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int number;
        boolean isPositive = false;

        do {
            System.out.print("Enter a positive number: ");
            number = scanner.nextInt();

            if (number > 0) {
                isPositive = true;
            } else {
                System.out.println("Invalid input. Please enter a number greater than 0.");
            }

        } while (!isPositive);

        System.out.println("You entered a valid positive number: " + number);
        scanner.close();
	}

}
