package javafundamentals;

public class Task72_DefaultValues {
	
	byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bool;

    public void printDefaults() {
        System.out.println("Default byte: " + b);
        System.out.println("Default short: " + s);
        System.out.println("Default int: " + i);
        System.out.println("Default long: " + l);
        System.out.println("Default float: " + f);
        System.out.println("Default double: " + d);
        System.out.println("Default char: '" + c + "'");
        System.out.println("Default boolean: " + bool);
   }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task72_DefaultValues obj = new Task72_DefaultValues();
        obj.printDefaults();

	}
}

