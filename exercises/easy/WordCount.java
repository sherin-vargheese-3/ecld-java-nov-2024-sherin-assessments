import java.util.Scanner;

public class WordCount {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String string = scanner.nextLine();
        String[] array = string.split(" ");

        System.out.println(wordCount(array));
    }

    public static int wordCount(String[] array) {
        return array.length;
    }
}
