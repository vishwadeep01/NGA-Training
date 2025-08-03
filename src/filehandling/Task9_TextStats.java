package filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task9_TextStats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "userdata.txt";

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                lineCount++;

                // Count words
                String[] words = line.trim().split(" ");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }

                // Count characters - excluding spaces
                String lineWithoutSpaces = line.replaceAll("\\s+", "");
                charCount += lineWithoutSpaces.length();
            }

            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters (excluding spaces): " + charCount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error reading the file: " + filePath);
            e.printStackTrace();
        }
	}

}
