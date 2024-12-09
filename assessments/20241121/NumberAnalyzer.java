import java.util.Scanner;
import java.util.InputMismatchException;

public class NumberAnalyzer {
    public static void analyzeNumber(int num) {

        System.out.println("Number " + num + " is:");

        if (num < 0) {                       // Checking positive, negative, or zero
            System.out.println("- Negative");
        } else if (num > 0) {
            System.out.println("- Positive");
        } else {
            System.out.println("- Zero");
            return;
        }

        if (num % 2 == 0) {                  // Checking even or odd
            System.out.println("- Even");
        } else {
            System.out.println("- Odd");
        }

        if (num % 5 == 0) {                  // Checking multiple of 5 or not
            System.out.println("- Multiple of 5");
        } else {
            System.out.println("- Not a multiple of 5");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        while (i <= 5) {
            System.out.print("Enter number " + i + ": ");
            try {
                int num = scanner.nextInt();  // Validate input
                analyzeNumber(num);
                i++; // Increment only if the input is valid
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
                scanner.next();  // Clear invalid input
            }
        }
        scanner.close();
    }
}
