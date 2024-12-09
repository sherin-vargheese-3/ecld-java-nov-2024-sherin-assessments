import java.util.*;

public class TemperatureConverter {
    public static double celsiusToFahrenheit(double celsius) {       //Celsius to Fahrenheit conversion
        return celsius * ((double) 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {    //Fahrenheit to Celsius conversion
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        System.out.println("3. Exit");

        while (true) {
            System.out.print("Choose option: ");
            int option;
            
            try {
                option = scanner.nextInt(); // Validate menu selection
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter 1, 2, or 3.");
                scanner.next(); // Clear invalid input
                continue;
            }
            

            switch (option) {
                case 1:
                    try {
                        System.out.print("Enter temperature in Celsius: ");
                        double celsius = scanner.nextDouble();
                        double celToFah = celsiusToFahrenheit(celsius);
                        System.out.println(String.format("%.1f", celsius) + "°C = "
                            + String.format("%.1f", celToFah) + "°F");
                    } catch(InputMismatchException e) {
                        System.out.println("Please enter a valid temperature");
                        scanner.next();
                        continue;
                    }
                    break;

                case 2:
                    try {
                        System.out.print("Enter temperature in Fahrenheit: ");
                        double fahrenheit = scanner.nextDouble();
                        double fahToCel = fahrenheitToCelsius(fahrenheit);
                        System.out.println(String.format("%.1f", fahrenheit) + "°F = "
                            + String.format("%.1f", fahToCel) + "°C");
                    } catch(InputMismatchException e) {
                        System.out.println("Please enter a valid temperature");
                        scanner.next();
                        continue;
                    }
                    break;
                case 3:
                    System.out.print("Exit...");
                    return;
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}