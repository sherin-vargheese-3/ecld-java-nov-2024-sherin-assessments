//Given an array of integers, return the
// largest gap between the sorted elements of the array.

import java.util.Arrays;
import java.util.Scanner;

public class LargestGap {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array : ");
        String string = scanner.nextLine();

        String[] stringArray = string.split(",");
        int[] array = new int[stringArray.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(stringArray[i].trim());
        }
        System.out.println("Before sorting : " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("After sorting : " + Arrays.toString(array));

        int result = findGap(array);
        System.out.println("largestGap = " + result);
        scanner.close();
    }

    public static int findGap(int[] array) {

        int max = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            int sub = array[i + 1] - array[i];
            if (sub > max) {
                max = sub;
            }
        }
        return max;
    }
}
