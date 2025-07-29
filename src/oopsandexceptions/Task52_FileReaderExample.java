package oopsandexceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Task52_FileReaderExample {

    public static void main(String[] args) {
        
        BufferedReader reader = null; 

        try {
            // FileReader opens the file, BufferedReader provides efficient reading
            reader = new BufferedReader(new FileReader("src/oopsandexceptions/example.txt"));
            String line;

            // Read the file line by line
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found. Please create 'example.txt'.");

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());

        } finally {
            try {
                if (reader != null) {
                	// Close the reader to release the file resource
                    reader.close(); 
                }
            } catch (IOException e) {
                System.err.println("Error closing the file reader: " + e.getMessage());
            }
        }
    }
}

