package assistedPracticeProject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        // Creating a file
        File file = new File("fileHandling.txt");

        try {
            // Writing to the file
            FileWriter writer = new FileWriter(file);
            writer.write("This is a FileHandling file.");
            writer.close();

            // Appending to the file
            FileWriter appendWriter = new FileWriter(file, true);
            appendWriter.write("\nThis is an appended line.");
            appendWriter.close();

            // Reading from the file
            java.util.Scanner scanner = new java.util.Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
