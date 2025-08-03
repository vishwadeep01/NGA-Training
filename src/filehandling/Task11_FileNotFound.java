package filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task11_FileNotFound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "nonexistentfile.txt"; 
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please check the file name and path.");
        } catch (IOException e) {
            System.out.println("An I/O error occurred while reading the file.");
            e.printStackTrace();
        }
	}

}
