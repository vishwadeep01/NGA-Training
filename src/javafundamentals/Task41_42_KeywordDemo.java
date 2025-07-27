package javafundamentals;

//Task 4.1 and 4.2
public class Task41_42_KeywordDemo {
	
	private static final int max = 5;
	
	public static void main(String [] args) {	
		
		//Task 4.2
		//int class = 2;
		int count = 0;
        for (int i = 0; i < max; i++) {
            if (i % 2 == 0) {
                boolean flag = true;
                char grade = 'A';
                double value = 10.5;
                System.out.println("Even: " + i + ", Grade: " + grade);
            } else {
                byte b = 1;
                short s = 2;
                long l = 100L;
                float f = 1.2f;
                System.out.println("Odd: " + i);
            }
            count++;
        }
	}
}


    

  

