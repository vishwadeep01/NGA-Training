package javafundamentals;

public class Task93_PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;    
        int num = 2;      

        System.out.println("First 10 prime numbers:");

        while (count < 10) {
            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }

            num++; 
        }

	}

}
