package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task3_WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int wordCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("./src/info.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
            	
                // Split the line into words using whitespace
                String[] words = line.trim().split(" ");
                
                // Avoid counting empty strings
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            System.out.println("Total words: " + wordCount);

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
	}

}
