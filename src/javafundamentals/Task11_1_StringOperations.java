package javafundamentals;

public class Task11_1_StringOperations {
	public static void main(String[] args) {
        String text = "JavaProgramming";

        int length = text.length();
        System.out.println("Length of the string: " + length);

        String upper = text.toUpperCase();
        System.out.println("Uppercase: " + upper);

        String lower = text.toLowerCase();
        System.out.println("Lowercase: " + lower);

        String sub = text.substring(4, 11); 
        System.out.println("Substring (index 4 to 10): " + sub);

        int indexOfP = text.indexOf('P');
        System.out.println("Index of character 'P': " + indexOfP);
    }
}
