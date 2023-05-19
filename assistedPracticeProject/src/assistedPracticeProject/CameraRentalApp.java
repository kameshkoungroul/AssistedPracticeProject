package assistedPracticeProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Camera {
    private String brand;
    private String model;
    private double rentalPricePerDay;

    public Camera(String brand, String model, double rentalPricePerDay) {
        this.brand = brand;
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }
}

class Wallet {
    private double amount;

    public Wallet(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void addFunds(double amount) {
        this.amount += amount;
    }
}

public class CameraRentalApp {
    private static List<Camera> cameraList;
    private static Wallet wallet;

    public static void main(String[] args) {
        initializeData();

        displayWelcomeScreen();

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            displayMainMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    displayCameraListing();
                    break;
                case 2:
                    rentCamera(scanner);
                    break;
                case 3:
                    manageWallet(scanner);
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
        System.out.println("Application closed.");
    }

    private static void initializeData() {
        cameraList = new ArrayList<>();
        cameraList.add(new Camera("Nikon", "D850", 500.0));
        cameraList.add(new Camera("Canon", "EOS R5", 600.0));
        cameraList.add(new Camera("Sony", "Alpha A7R IV", 550.0));

        wallet = new Wallet(1000.0);
    }

    private static void displayWelcomeScreen() {
        System.out.println("Welcome to Camera Rental App");
        System.out.println("Developer Details: Kameshwaran K");
    }

    private static void displayMainMenu() {
        System.out.println("Main Menu");
        System.out.println("1. List Cameras");
        System.out.println("2. Rent a Camera");
        System.out.println("3. Wallet");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void displayCameraListing() {
        System.out.println("Camera Listing:");
        System.out.println("----------------------------");
        System.out.println("ID\tBrand\tModel\tRental Price per Day");

        for (int i = 0; i < cameraList.size(); i++) {
            Camera camera = cameraList.get(i);
            System.out.printf("%d\t%s\t%s\tRs%.2f\n", i + 1, camera.getBrand(), camera.getModel(), camera.getRentalPricePerDay());
        }

        System.out.println();
    }

    private static void rentCamera(Scanner scanner) {
        System.out.print("Enter the ID of the camera you want to rent: ");
        int cameraId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        if (cameraId < 1 || cameraId > cameraList.size()) {
            System.out.println("Invalid camera ID.");
            return;
        }

        Camera selectedCamera = cameraList.get(cameraId - 1);

        System.out.println("You have selected the following camera:");
        System.out.println("Brand: " + selectedCamera.getBrand());
        System.out.println("Model: " + selectedCamera.getModel());
        System.out.println("Rental Price per Day: Rs" + selectedCamera.getRentalPricePerDay());
        System.out.println();

        System.out.print("Enter the number of days you want to rent the camera: ");
        int numDays = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        double totalAmount = selectedCamera.getRentalPricePerDay() * numDays;

        if (totalAmount > wallet.getAmount()) {
            System.out.println("Insufficient funds in your wallet. Please add funds.");
            return;
        }

        wallet.addFunds(-totalAmount);

        System.out.println("Camera rented successfully for " + numDays + " days.");
        System.out.println("Total Amount: Rs" + totalAmount);
        System.out.println("Remaining Wallet Balance: Rs" + wallet.getAmount());
        System.out.println();
    }

    private static void manageWallet(Scanner scanner) {
        System.out.println("Wallet Management");
        System.out.println("----------------------------");
        System.out.println("1. View Wallet Balance");
        System.out.println("2. Add Funds");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        switch (choice) {
            case 1:
                System.out.println("Wallet Balance: Rs" + wallet.getAmount());
                System.out.println();
                break;
            case 2:
                System.out.print("Enter the amount to add to your wallet: ");
                double amount = scanner.nextDouble();
                scanner.nextLine(); // Consume newline character
                wallet.addFunds(amount);
                System.out.println("Funds added successfully.");
                System.out.println("Updated Wallet Balance: Rs" + wallet.getAmount());
                System.out.println();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                System.out.println();
        }
    }


    }