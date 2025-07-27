package javafundamentals;

//Task 5.2
public class Task52_ReverseString {

	public static void main(String[] args) {
		if (args.length <= 0) {
            System.out.println("Provide vaild input!!!");
            return;
        }

        String input = args[0];
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i); 
        }
        return reversed;
	}
}
