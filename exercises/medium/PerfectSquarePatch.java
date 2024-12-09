package medium;

import java.util.Scanner;

public class PerfectSquarePatch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        squarePatch(number);
    }

    public static void squarePatch(int number) {
        System.out.println("[");
        for (int i = 0; i < number; i++) {
            System.out.print("  [");
            for (int j = 0; j < number; j++) {
                System.out.print(number);
                if (j < number - 1) { // Add a comma except for the last element
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            if (i < number - 1) { // Add a comma except for the last row
                System.out.println(",");
            } else {
                System.out.println();
            }
        }
        System.out.println("]");
    }
}

//squarePatch(5) ➞ [
//        [5, 5, 5, 5, 5],
//        [5, 5, 5, 5, 5],
//        [5, 5, 5, 5, 5],
//        [5, 5, 5, 5, 5],
//        [5, 5, 5, 5, 5]
//        ]
