import java.util.Scanner;

public class Calculator {
    public static double add(double a, double b) {           //Addition
        return a + b;
    }

    public static double subtract(double a, double b) {      //Subtraction
        return a - b;
    }

    public static double multiply(double a, double b) {     //Multiplication
        return a * b;
    }

    public static double divide(double a, double b) {       //Division
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double first = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double second = scanner.nextDouble();

        System.out.println("Choose operation:");
        System.out.println("1. Add (+)");
        System.out.println("2. Subtract (-)");
        System.out.println("3. Multiply (*)");
        System.out.println("4. Divide (/)");

        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                double result1 = add(first, second);
                System.out.println(first + " + " + second + " = " + result1);
                break;
            case 2:
                double result2 = subtract(first, second);
                System.out.println(first + " - " + second + " = " + result2);
                break;
            case 3:
                double result3 = multiply(first, second);
                System.out.println(first + " * " + second + " = " + result3);
                break;
            case 4:
                if (second == 0) {
                    System.out.println("Division by zero");
                } else {
                    double result4 = divide(first, second);
                    System.out.println(first + " / " + second + " = " + result4);
                }
                break;
            default:
                System.out.println("Invalid input");
        }
        scanner.close();
    }
}
