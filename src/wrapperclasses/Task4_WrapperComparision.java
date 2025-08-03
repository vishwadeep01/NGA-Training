package wrapperclasses;

public class Task4_WrapperComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer a = 100;

        @SuppressWarnings("removal")
		Integer b = new Integer(100);

        System.out.println("Result of a == b: " + (a == b));
        System.out.println("Result of a.equals(b): " + a.equals(b));
        System.out.println("Explanation: The 'new' keyword forces "
        		+ "the creation of two separate objects in memory. "
        		+ "Since they have different memory addresses, '==' returns false.");
	}

}
