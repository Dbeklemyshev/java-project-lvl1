package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static final String GAME_DESCRIPTION = "Answer 'yes' if number even otherwise answer 'no'.";
    public static final String ANSWER_YES = "yes";
    public static final String ANSWER_NO = "no";
    public static final int RANGE_LIMIT_0 = 0;
    public static final int RANGE_LIMIT_100 = 100;

    public static void runGame() {
        String[][] gameData = new String[Engine.COUNT_ROUND][2];
        for (int round = 0; round < Engine.COUNT_ROUND; round++) {
            gameData[round] = generateRoundData();
        }
        Engine.runGame(GAME_DESCRIPTION, gameData);
    }

    private static String[] generateRoundData() {
        String[] roundData = new String[2];
        int number = Utils.generateRandomNumber(RANGE_LIMIT_0, RANGE_LIMIT_100);
        String trueAnswer = isEven(number) ? ANSWER_YES : ANSWER_NO;
        roundData[0] = Integer.toString(number);
        roundData[1] = trueAnswer;
        return roundData;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
