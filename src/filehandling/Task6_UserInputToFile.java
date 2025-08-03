package filehandling;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task6_UserInputToFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        BufferedWriter writer = null;

        try {
            // Take input from user
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your email: ");
            String email = scanner.nextLine();

            System.out.print("Enter your address: ");
            String address = scanner.nextLine();

            // Define the file path
            String filePath = "userdata.txt";

            // Initialize BufferedWriter
            writer = new BufferedWriter(new FileWriter(filePath));

            // Write data to file
            writer.write("Name: " + name);
            writer.newLine();
            writer.write("Email: " + email);
            writer.newLine();
            writer.write("Address: " + address);

            System.out.println("User data saved to " + filePath);

        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please check the path.");
            e.printStackTrace();

        } finally {   
        	writer.close();
        	scanner.close();
        }
	}
}
