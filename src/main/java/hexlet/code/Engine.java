package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int COUNT_ROUND = 3;
    public static final String GREETING_TEXT = "Welcome to the Brain Games!";
    public static final String QUESTION = "May I have your name? ";

    public static void runGame(String startText, String[][] gameData) {
        Scanner engineScanner = new Scanner(System.in);
        System.out.println(GREETING_TEXT);
        System.out.print(QUESTION);
        String gamerName = engineScanner.nextLine();
        System.out.println("Hello, " + gamerName + "!");
        System.out.println(startText);

        for (String[] questionData: gameData) {
            String question = questionData[0];
            String answer = questionData[1];
            System.out.print("Question: " + question + "\nYour answer: ");
            String gamerAnswer = engineScanner.nextLine();
            if (!gamerAnswer.equals(answer)) {
                System.out.print("'" + gamerAnswer + "' is wrong answer ;(. ");
                System.out.println("Let's try again, " + gamerName + "!");
                engineScanner.close();
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + gamerName + "!");
        engineScanner.close();
    }
}
