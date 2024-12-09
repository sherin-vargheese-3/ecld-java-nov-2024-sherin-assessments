import java.util.Scanner;

public class EndsWith {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string : ");
        String first = scanner.nextLine();

        System.out.print("Enter the second string : ");
        String second = scanner.nextLine();

        if(checkEnding(first, second)) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }

    public static boolean checkEnding(String first, String second) {

        if(first == null || second == null) {
            return false;
        }
        return first.endsWith(second);
    }
}
