package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {
    public static final int GREET_NM = 1;
    public static final int EVEN_NM = 2;
    public static final int CALC_NM = 3;
    public static final int GDC_NM = 4;
    public static final int PROGRESSION_NM = 5;
    public static final int PRIME_NM = 6;
    public static final String MENU_INFO = "Please enter the game number and press Enter.";
    public static final String MENU_GAMES = GREET_NM + " - Greet\n"
            + EVEN_NM + " - Even\n"
            + CALC_NM + " - Calc\n"
            + GDC_NM + " - GCD\n"
            + PROGRESSION_NM + " - Progression\n"
            + PRIME_NM + " - Prime\n"
            + "0 - Exit\nYour choice: ";

    public static void main(String[] args) {
        Scanner mainScanner = new Scanner(System.in);
        System.out.println(MENU_INFO);
        System.out.print(MENU_GAMES);
        int selectedGame = mainScanner.nextInt();
        switch (selectedGame) {
            case GREET_NM -> Cli.welcome();
            case EVEN_NM -> Even.runGame();
            case CALC_NM -> Calc.runGame();
            case GDC_NM -> GCD.runGame();
            case PROGRESSION_NM -> Progression.runGame();
            case PRIME_NM -> Prime.runGame();
            case 0 -> { }
            default -> System.out.print("game with number " + selectedGame + " not found!");

        }
        mainScanner.close();
    }
}
