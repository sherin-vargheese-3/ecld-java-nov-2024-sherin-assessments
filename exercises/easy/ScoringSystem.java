package Easy;

import java.util.Arrays;
import java.util.Scanner;

public class ScoringSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String string = scanner.nextLine();

        int countA = 0, countB = 0, countC = 0;
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            switch (c) {
                case 'A'-> countA++;
                case 'B'-> countB++;
                case 'C'-> countC++;
            }
        }
        int[] array = new int[3];
        array[0] = countA;
        array[1] = countB;
        array[2] = countC;

        System.out.println(Arrays.toString(array));
    }
}
