@FunctionalInterface
interface Calculator {
    double calculate(double a, double b);
}

public class calculator {
    public static void main(String[] args) {


        // Lambda expressions for different operations
        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;
        Calculator multiplication = (a, b) -> a * b;
        Calculator division = (a, b) -> b != 0 ? a / b : Double.NaN; // Handle division by zero
        Calculator exponentiation = (a, b) -> Math.pow(a, b);

        // Testing the calculator functions
        double num1 = 5, num2 = 3;
        System.out.println("Addition: " + addition.calculate(num1, num2));
        System.out.println("Subtraction: " + subtraction.calculate(num1, num2));
        System.out.println("Multiplication: " + multiplication.calculate(num1, num2));
        System.out.println("Division: " + division.calculate(num1, num2));
        System.out.println("Exponentiation: " + exponentiation.calculate(num1, num2));


    }
}
