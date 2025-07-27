package javafundamentals;

public class Task10_2_TransposeOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Display original matrix
        System.out.println("Original Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Transpose the matrix
        System.out.println("\nTranspose of the Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
	}

}
