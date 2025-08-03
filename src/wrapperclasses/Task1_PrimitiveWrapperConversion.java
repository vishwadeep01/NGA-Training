package wrapperclasses;

public class Task1_PrimitiveWrapperConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primitiveInt = 42;
        double primitiveDouble = 99.9;
        char primitiveChar = 'G';

        //Converting primitives to Wrapper classes 
        Integer wrapperInt = Integer.valueOf(primitiveInt);
        Double wrapperDouble = Double.valueOf(primitiveDouble);
        Character wrapperChar = Character.valueOf(primitiveChar);

        System.out.println("## Wrapper Class Object Values ");
        System.out.println("Integer Object: " + wrapperInt);
        System.out.println("Double Object: " + wrapperDouble);
        System.out.println("Character Object: " + wrapperChar);
        
        System.out.println("---------------------------------");

        // Convert Wrapper objects back to primitives 
        int backToInt = wrapperInt.intValue();
        double backToDouble = wrapperDouble.doubleValue();
        char backToChar = wrapperChar.charValue();

        System.out.println("## Values Converted Back to Primitives");
        System.out.println("Back to int: " + backToInt);
        System.out.println("Back to double: " + backToDouble);
        System.out.println("Back to char: " + backToChar);
	}

}
