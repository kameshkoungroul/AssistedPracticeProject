package assistedPracticeProject;

import java.util.Scanner;

public class ImpTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        try {
            int num = Integer.parseInt(scanner.nextLine());
            System.out.println("Your number is: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}
