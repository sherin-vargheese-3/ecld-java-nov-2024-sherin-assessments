//A train has a maximum capacity of n passengers overall,
// which means each carriage's capacity will share an equal
// proportion of the maximum capacity.

//Create a function which returns the index of
// the first carriage which holds 50% or less of its maximum capacity.
// If no such carriage exists, return -1.
package medium;

import java.util.Scanner;

public class CrowdedCarriageCapacity {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input carriage capacities
        System.out.print("Enter the capacities of carriages separated by spaces: ");
        String[] stringArray = scanner.nextLine().split(" ");
        int[] capacities = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            capacities[i] = Integer.parseInt(stringArray[i].trim());
        }

        // Input total number of passengers
        System.out.print("Enter the total number of passengers: ");
        int totalPassengers = scanner.nextInt();

        // Index of the first under-utilized carriage
        int result = findUnderUtilizedCarriage(totalPassengers, capacities);

        System.out.println("Index of the first under-utilized carriage: " + result);
    }

    public static int findUnderUtilizedCarriage(int totalPassengers, int[] capacities) {

        int average = totalPassengers / capacities.length;
        System.out.println("Average : " + average);
        int threshold = average / 2;
        for (int i = 0; i < capacities.length; i++) {
            if(capacities[i] <= threshold) {
                return i;
            }
        }
        return -1;
    }
}