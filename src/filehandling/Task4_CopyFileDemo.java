package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task4_CopyFileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String sourceFile = "./src/info.txt";
        String destinationFile = "./src/copy.txt";

        try (
            BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); 
            }

            System.out.println("File copied successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("File not exists in given path: ");
            e.printStackTrace();
        }
	}

}
