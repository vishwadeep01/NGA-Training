package javafundamentals;

public class Task82_OperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a = 5;

        System.out.println("Initial a = " + a);
        System.out.println("Post-increment a++ = " + (a++));  
        System.out.println("After post-increment, a = " + a);
        System.out.println("Pre-increment ++a = " + (++a));   

      
        int x = 8;  
        System.out.println("\nOriginal x = " + x);
        System.out.println("x << 1 = " + (x << 1)); 
        System.out.println("x >> 1 = " + (x >> 1)); 

        
        boolean b1 = true;
        boolean b2 = false;

        System.out.println("\nLogical AND (&&): " + (b1 && b2)); 
        System.out.println("Bitwise AND (&): " + (b1 & b2));     
               
        int y = 6;   
        int z = 3;   
        System.out.println("Bitwise AND on integers (6 & 3): " + (y & z)); 
	        
	}
}
