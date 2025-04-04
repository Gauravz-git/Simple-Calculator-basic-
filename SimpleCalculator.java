import java.util.Scanner;

public class SimpleCalculator {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        char operator;

        // Validate first number
        System.out.print("Enter first number: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input! Please enter a valid number.");
            scanner.next(); // Consume invalid input
            System.out.print("Enter first number: ");
        }
        num1 = scanner.nextDouble();

        // Validate operator
        System.out.print("Enter an operator (+, -, *, /): ");
        while (true) {
            operator = scanner.next().charAt(0);
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                break; // Valid operator
            } else {
                System.out.println("Invalid operator! Please enter one of +, -, *, /.");
                System.out.print("Enter an operator: ");
            }
        }

        // Validate second number
        System.out.print("Enter second number: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input! Please enter a valid number.");
            scanner.next(); // Consume invalid input
            System.out.print("Enter second number: ");
        }
        num2 = scanner.nextDouble();

        // Perform calculation
        double result;
        switch (operator) {
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
                if (num2 == 0) {
                    System.out.println("Error! Division by zero is not allowed.");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Unexpected error.");
                return;
        }

        // Display result
        System.out.println("Result: " + result);
        scanner.close();
    }
}
