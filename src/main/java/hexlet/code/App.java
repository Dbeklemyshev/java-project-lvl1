package hexlet.code;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;

import java.util.Scanner;

public class App {
    public static final int GREET_NM = 1;
    public static final int EVEN_NM = 2;
    public static final int CALC_NM = 3;
    public static final String MENU_INFO = "Please enter the game number and press Enter.";
    public static final String MENU_GAMES = GREET_NM + " - Greet\n"
            + EVEN_NM + " - Even\n"
            + CALC_NM + " - Calc\n"
            + "0 - Exit\nYour choice: ";


    public static void main(String[] args) {
        Scanner mainScanner = new Scanner(System.in);
        System.out.println(MENU_INFO);
        System.out.print(MENU_GAMES);
        playGame(mainScanner);
        mainScanner.close();
    }

    public static void playGame(Scanner mainScanner) {
        switch (mainScanner.nextInt()) {
            case GREET_NM:
                Cli.welcome();
                break;
            case EVEN_NM:
                Even.playGame();
                break;
            case CALC_NM:
                Calc.playGame();
                break;

            default:
                break;
        }
    }
}
