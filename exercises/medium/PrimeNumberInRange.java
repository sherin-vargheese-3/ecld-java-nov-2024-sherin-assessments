//Any Prime Number in Range.
package medium;

import java.util.Scanner;

public class PrimeNumberInRange {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the beginning value : ");
        int i = scanner.nextInt();
        System.out.print("Enter the end value : ");
        int n = scanner.nextInt();
        System.out.print(InRange(i, n));
    }

    public static boolean InRange(int i, int n) {
        while (i < n) {          //In the given range.
            if(isPrime(i)){       //Selecting a number and checking prime or not
                return true;
            }
            i++;
        }
        return false;
    }

    public static boolean isPrime(int num) {  //Prime or not
        for (int i = 2; i < num/2; i++){
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
