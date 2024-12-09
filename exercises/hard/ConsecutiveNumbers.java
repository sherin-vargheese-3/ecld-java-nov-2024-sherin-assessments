//Create a function that determines whether elements in an
// array can be re-arranged to form a consecutive list of
// numbers where each number appears exactly once.

import java.util.Arrays;
import java.util.Scanner;

public class ConsecutiveNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter five numbers : ");
        String string = scanner.nextLine();

        String[] stringArray = string.split(",");  //Split the string based on "," and added to a string array.

        int[] array = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            array[i] = Integer.parseInt(stringArray[i].trim()); // Convert in to integer and trim spaces.
        }

        Arrays.sort(array);  //Sorting.
        System.out.println(Arrays.toString(array));  //print the sorted array.

        System.out.println(consecutive(array));
    }

    public static boolean consecutive(int[] array) {

        for (int i = 0;i < array.length - 1; i++) {
            if (array[i] + 1 != array[i + 1]) {  //Comparing the consecutive numbers.
                return false;
            }
        }
        return true;
    }
}
