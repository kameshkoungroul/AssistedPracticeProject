package assistedPracticeProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImpFileHandling {

    public static void main(String[] args) throws IOException {

        // Creating a new file
        File file = new File("example.txt");
        if (file.createNewFile()) {
            System.out.println("File created: " + file.getName());
        } else {
            System.out.println("File already exists.");
        }

        // Writing data to the file
        FileOutputStream fos = new FileOutputStream(file);
        String data = "This is an example text.";
        byte[] byteArray = data.getBytes();
        fos.write(byteArray);
        System.out.println("Data written to the file.");

        // Reading data from the file
        FileInputStream fis = new FileInputStream(file);
        byte[] byteArrayRead = new byte[(int) file.length()];
        fis.read(byteArrayRead);
        String dataRead = new String(byteArrayRead);
        System.out.println("Data read from the file: " + dataRead);

        // Appending data to the file
        FileOutputStream fosAppend = new FileOutputStream(file, true);
        String dataAppend = "\nThis is appended text.";
        byte[] byteArrayAppend = dataAppend.getBytes();
        fosAppend.write(byteArrayAppend);
        System.out.println("Data appended to the file.");

        // Deleting the file
        if (file.delete()) {
            System.out.println("File deleted: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }

    }

}
