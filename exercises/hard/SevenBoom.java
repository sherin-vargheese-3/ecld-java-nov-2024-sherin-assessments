package hard;

import java.util.Scanner;

public class SevenBoom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array : ");
        String[] stringArray = scanner.nextLine().split(" ");
        int[] array = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            array[i] = Integer.parseInt(stringArray[i].trim());
        }

        if (sevenBoom(array)) {
            System.out.println("Boom!");
        } else {
            System.out.println("There is no 7 in the array");
        }
    }

    public static boolean sevenBoom(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 7) {
                return true;
            }
        }
        return false;
    }
}
