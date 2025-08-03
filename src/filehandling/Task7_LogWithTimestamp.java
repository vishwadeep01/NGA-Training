package filehandling;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task7_LogWithTimestamp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 String filePath = "app.log";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Current timestamp
        String timestamp = LocalDateTime.now().format(formatter);

        // Log message
        String logMessage = "[" + timestamp + "] Application started";

        BufferedWriter writer = null;

        try {
            // Open file in append mode
            writer = new BufferedWriter(new FileWriter(filePath, true));
            writer.write(logMessage);
            writer.newLine();
            System.out.println("Log entry added: " + logMessage);
        } catch (FileNotFoundException e) {
            System.out.println("Log file not found. Please check the file path.");
            e.printStackTrace();
        } finally {
            writer.close();            
        }
	}

}
