import java.util.Arrays;
import java.util.Scanner;

public class RecursionArraySum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array : ");
        String string = scanner.nextLine();

        String[] stringArray = string.split(",");
        int[] array = new int[stringArray.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(stringArray[i].trim());
        }
        System.out.println("Array : " + Arrays.toString(array));

        int sum = arraySum(array, array.length);
        System.out.println("Sum : " + sum);
    }

    public static int arraySum(int[] array, int n) {
        if(n == 0) {
            return 0;
        }
        return array[n - 1] + arraySum(array, n - 1); //Calling recursively by decrementing length
    }
}
