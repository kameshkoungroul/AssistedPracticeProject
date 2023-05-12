package assistedPracticeProject;

import java.util.Scanner;


class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ImpException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");

        try {
            int age = scanner.nextInt();

            if (age < 0 || age > 120) {
                throw new InvalidAgeException("Invalid age entered!");
            }

            System.out.println("Age entered: " + age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("This code is always executed, whether an exception is thrown or not.");
            scanner.close();
        }
    }
}
