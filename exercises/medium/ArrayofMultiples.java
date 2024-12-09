import java.util.Arrays;
import java.util.Scanner;

public class ArrayofMultiples {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scanner.nextInt();
        System.out.print("Enter the length : ");
        int length = scanner.nextInt();
        System.out.println(Arrays.toString(arrayOfMultiples(num, length)));
    }

    public static int[] arrayOfMultiples(int num, int length) {
        int[] array = new int[length];
        for (int i = 1, j = 0; i <= length; i++, j++) {
            array[j] = num * i;         // Creating the array of multiples
        }
        return array;
    }
}
