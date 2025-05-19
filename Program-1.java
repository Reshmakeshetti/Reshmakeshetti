import java.util.Scanner;

public class Calculator {
    private double a;
    private double b;
    private String operation;

    // Constructor
    public Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation.toLowerCase(); // To handle case-insensitive input
    }

    // Method to perform calculation
    public double calculate() {
        switch (operation) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                if (b != 0) {
                    return a / b;
                } else {
                    throw new ArithmeticException("Cannot divide by zero.");
                }
            default:
                throw new IllegalArgumentException("Invalid operation type.");
        }
    }

    // Main method for demonstration
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter first number (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = scanner.nextDouble();

        scanner.nextLine(); // Consume the leftover newline

        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String operation = scanner.nextLine();

        // Create calculator object and perform calculation
        Calculator calculator = new Calculator(a, b, operation);

        try {
            double result = calculator.calculate();
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
