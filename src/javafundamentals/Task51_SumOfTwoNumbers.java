package javafundamentals;

//Task 5.1
public class Task51_SumOfTwoNumbers {

	public static void main(String[] args) {
		// Check if exactly 2 arguments are passed
        if (args.length != 2) {
            System.out.println("Provide vaild input!!!");
            return;
        }

        try {
        	
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            int sum = num1 + num2;

            
            System.out.println("Sum: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integers.");
        }
	}

}
