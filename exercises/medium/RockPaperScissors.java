package medium;

import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("\"rock\", \"paper\", \"scissors\" player 1: ");
        String  first = scanner.nextLine();

        System.out.print("\"rock\", \"paper\", \"scissors\" player 2: ");
        String  second = scanner.nextLine();

        System.out.print(rps(first, second));
    }

    public static String rps(String first, String second) {
        int priorityValueFirst = priority(first);
        int priorityValueSecond = priority(second);

        if(priorityValueFirst < priorityValueSecond) {
            return "Player 1 wins";
        }
        if(priorityValueSecond < priorityValueFirst) {
            return "Player 2 wins";
        }
        return "TIE";
    }

    public static int priority(String string) {
        int priorityValue = 0;
        switch (string) {
            case "rock"-> priorityValue = 1;
            case "scissors"-> priorityValue = 2;
            case "paper"-> priorityValue = 3;
        }
        return priorityValue;
    }
}
