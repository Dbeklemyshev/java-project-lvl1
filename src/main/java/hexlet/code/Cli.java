package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static final String GREETING_TEXT = "Welcome to the Brain Games!";
    public static final String QUESTION = "May I have your name? ";

    public static void welcome() {
        Scanner cliScanner = new Scanner(System.in);
        String userName;
        System.out.println(GREETING_TEXT);
        System.out.print(QUESTION);
        userName = cliScanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        cliScanner.close();
    }
}
