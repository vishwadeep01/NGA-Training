package filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task2_FileReadDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	 FileReader filereader = null;
	 BufferedReader reader = null;
	 try {
           	filereader = new FileReader("./src/info.txt");
            reader = new BufferedReader(filereader);
            
            String line;
            int count = 0;
            
            while ((line = reader.readLine()) != null) {
                count++;
                System.out.println("Line " + count + ": " + line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not exists.");
            e.printStackTrace();
        }finally {
        	reader.close();
        }
	}

}
