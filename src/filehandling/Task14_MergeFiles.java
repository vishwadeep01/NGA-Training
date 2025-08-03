package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task14_MergeFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String file1 = "data.txt";
        String file2 = "output.txt";
        String mergedFile = "merged.txt";

        try (
            BufferedWriter writer = new BufferedWriter(new FileWriter(mergedFile));
            BufferedReader reader1 = new BufferedReader(new FileReader(file1));
            BufferedReader reader2 = new BufferedReader(new FileReader(file2))
        ) {
            String line;
            while ((line = reader1.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            while ((line = reader2.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Files merged successfully into " + mergedFile);

        } catch (FileNotFoundException e) {
            System.out.println("One of the source files was not found.");
        } catch (IOException e) {
            System.out.println("An error occurred while merging files.");
            e.printStackTrace();
        }
	}

}
