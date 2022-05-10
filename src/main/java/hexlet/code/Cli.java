package hexlet.code;

import java.util.Scanner;
import static hexlet.code.Engine.GREETING_TEXT;
import static hexlet.code.Engine.QUESTION;

public class Cli {

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
