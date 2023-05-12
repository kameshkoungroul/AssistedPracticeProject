package assistedPracticeProject;


class Vehicle {
	 private String make;
	 private String model;
	 private int year;


	 public Vehicle(String make, String model, int year) {
	     this.make = make;
	     this.model = model;
	     this.year = year;
	 }

	 // Getters and setters for the private fields
	 public String getMake() {
	     return make;
	 }

	 public void setMake(String make) {
	     this.make = make;
	 }

	 public String getModel() {
	     return model;
	 }

	 public void setModel(String model) {
	     this.model = model;
	 }

	 public int getYear() {
	     return year;
	 }

	 public void setYear(int year) {
	     this.year = year;
	 }

	 
	 public void printDetails() {
	     System.out.println("Make: " + make);
	     System.out.println("Model: " + model);
	     System.out.println("Year: " + year);
	 }
	}

	class Car extends Vehicle {
	 private int numDoors;

	 
	 public Car(String make, String model, int year, int numDoors) {
	     super(make, model, year);
	     this.numDoors = numDoors;
	 }

	 
	 public int getNumDoors() {
	     return numDoors;
	 }

	 public void setNumDoors(int numDoors) {
	     this.numDoors = numDoors;
	 }

	 
	 public void printDetails() {
	     super.printDetails();
	     System.out.println("Number of doors: " + numDoors);
	 }
	}


	public class ImpOop {
	 public static void main(String[] args) {
	    
	     Car myCar = new Car("Nissan", "GTR", 2018, 2);

	   
	     System.out.println("My car is a " + myCar.getMake());

	     
	     myCar.setMake("lambo");
	     System.out.println("My car is now a " + myCar.getMake());

	     myCar.printDetails();
	 }
	}