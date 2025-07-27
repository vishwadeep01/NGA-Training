package javafundamentals;

public class Task10_3_ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {64, 25, 12, 22, 11};

	        System.out.println("Original Array:");
	        printArray(arr);

	        bubbleSort(arr);

	        System.out.println("\nSorted Array (Ascending Order):");
	        printArray(arr);
	}
	
	public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {           
            for (int j = 0; j < n - i - 1; j++) {   
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
	
	public static void printArray(int[] array) {
        for (int val : array) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
