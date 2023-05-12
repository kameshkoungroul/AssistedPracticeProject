package assistedPracticeProject;

import java.io.File;
import java.io.IOException;

public class FileOperations {
    public static void main(String[] args) {
        String fileName = "test.txt";
        
        // Creating a new file
        File file = new File(fileName);
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
        
        // Write to the file
        try {
            java.io.FileWriter writer = new java.io.FileWriter(file);
            writer.write("This is the first line.\n");
            writer.write("This is the second line.\n");
            writer.close();
            System.out.println("File updated.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
        
        // Read the file
        try {
            java.util.Scanner scanner = new java.util.Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
        
        // Update the file
        try {
            java.io.FileWriter writer = new java.io.FileWriter(file, true);
            writer.write("This is the third line.\n");
            writer.close();
            System.out.println("File updated.");
        } catch (IOException e) {
            System.out.println("An error occurred while updating the file.");
            e.printStackTrace();
        }
        
        // Delete the file
        if (file.delete()) {
            System.out.println("File deleted: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}

