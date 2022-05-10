package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import static hexlet.code.games.Even.ANSWER_NO;
import static hexlet.code.games.Even.ANSWER_YES;


public class Prime {
    public static final String GAME_DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static final int RANGE_LIMIT_1 = 1;
    public static final int RANGE_LIMIT_100 = 100;
    public static void runGame() {
        Engine.runGame(GAME_DESCRIPTION, getGameData());
    }
    private static String[] generateRoundData() {
        String[] roundData = new String[2];
        String trueAnswer;
        int number1 = Utils.generateRandomNumber(RANGE_LIMIT_1, RANGE_LIMIT_100);
        if (calculateIsPrime(number1)) {
            trueAnswer = ANSWER_YES;
        } else {
            trueAnswer = ANSWER_NO;
        }
        roundData[0] = Integer.toString(number1);
        roundData[1] = trueAnswer;
        return roundData;
    }
    private static boolean calculateIsPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        } return true;

    }

    private static String[][] getGameData() {
        String[][] gameData = new String[Engine.COUNT_ROUND][2];
        for (int round = 0; round < Engine.COUNT_ROUND; round++) {
            gameData[round] = generateRoundData();
        }
        return gameData;
    }
}
