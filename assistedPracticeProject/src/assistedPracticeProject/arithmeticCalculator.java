package assistedPracticeProject;

import java.util.Scanner;

public class arithmeticCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter first number: ");
			int num1 = scanner.nextInt();

			System.out.print("Enter second number: ");
			int num2 = scanner.nextInt();

			System.out.println("Choose an operation (+, -, *, /): ");
			char operator = scanner.next().charAt(0);

			int result;
			switch(operator) {
			    case '+':
			        result = num1 + num2;
			        break;
			    case '-':
			        result = num1 - num2;
			        break;
			    case '*':
			        result = num1 * num2;
			        break;
			    case '/':
			        result = num1 / num2;
			        break;
			    default:
			        System.out.println("Invalid operator");
			        return;
			}

			System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
		}
    }
}
