package javafundamentals;

//Task 3.1 and 3.2 combined

public class Task31_32_HelloWorld {

	public static void main(String[] args) {
		if (args.length <= 0) {
            System.out.println("! Not a valid input");
            return;
        }
		
		//static input 
		System.out.println("Hello, Vishwadeep!");
        System.out.println("Today is a great day to code Java!");
		
       
        //name via command-line argument
        String name = args[0];
        System.out.println("Hello, " + name + "!");
        }

}

