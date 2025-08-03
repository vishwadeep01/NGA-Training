package wrapperclasses;

public class Task3_StringParsingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Input strings to be parsed
        String intStr = "123";
        String doubleStr = "45.67";
        String booleanStr = "true";


        // Convert strings to primitives 
        int parsedInt = Integer.parseInt(intStr);
        double parsedDouble = Double.parseDouble(doubleStr);
        boolean parsedBoolean = Boolean.parseBoolean(booleanStr);


        // We use getClass().getSimpleName() on the boxed version to display the type name
        System.out.println("Value: " + parsedInt + ", Type: " + ((Object) parsedInt).getClass().getSimpleName());
        System.out.println("Value: " + parsedDouble + ", Type: " + ((Object) parsedDouble).getClass().getSimpleName());
        System.out.println("Value: " + parsedBoolean + ", Type: " + ((Object) parsedBoolean).getClass().getSimpleName());
	}

}
