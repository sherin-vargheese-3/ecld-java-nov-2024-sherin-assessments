//Create a function that will count the number of digits of a number
package medium;

import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = scanner.nextInt();
        System.out.print("Count : " + digitsCount(number));
    }

    public static int digitsCount(int number) {

        if (number == 0) {           // if the number is 0, return 1, only single digit.
            return 1;
        }
        return 1 + digitsCount(number / 10);   // Recursive call.
    }
}
