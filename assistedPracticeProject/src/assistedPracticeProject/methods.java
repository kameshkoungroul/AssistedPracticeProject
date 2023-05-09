package assistedPracticeProject;

public class methods {
    public static void main(String[] args) {
        methods example = new methods();
        
        // calling a method without any parameters
        example.displayMessage();
        
        // calling a method with one parameter
        int sum = example.addNumbers(5, 7);
        System.out.println("The sum is " + sum);
        
        // calling a method with multiple parameters
        double result = example.calculateResult(3.5, 2, "add");
        System.out.println("The result is " + result);
    }
    
    private double calculateResult(double d, int i, String string) {
		
		return 0;
	}

	private int addNumbers(int i, int j) {
	
		return 0;
	}

	// method without any parameters and return value
    public void displayMessage() {
        System.out.println("Hello, world!");
    }
}