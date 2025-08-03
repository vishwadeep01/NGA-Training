package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task13_ReplaceWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputFile = "data.txt";
        String outputFile = "output.txt";

        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Replace "Java" with "Python"
                String modifiedLine = line.replace("Java", "Python");
                writer.write(modifiedLine);
                writer.newLine();
            }

            System.out.println("Replacement complete. Output written to " + outputFile);

        } catch (FileNotFoundException e) {
            System.out.println("Input file not found: " + inputFile);
        } catch (IOException e) {
            System.out.println("An I/O error occurred.");
            e.printStackTrace();
        }
	}
}
