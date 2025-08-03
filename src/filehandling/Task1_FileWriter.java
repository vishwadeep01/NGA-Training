package filehandling;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Task1_FileWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileWriter writer = null;
		
		try {
            writer = new FileWriter("./src/info.txt");
            
            // Write first line
            writer.write("Java I/O is powerful!\n"); 
            // Append second line
            // writer.write("Learn Java step-by-step");
            
            System.out.println("Successfully written to info.txt");
        }catch (FileNotFoundException fe) {
        	System.out.println("An error occurred.");
            fe.printStackTrace();
        }finally{
        	writer.close();
        }
	}
}
