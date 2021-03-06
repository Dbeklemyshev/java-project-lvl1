package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static final String GAME_DESCRIPTION = "Find the greatest common divisor of given numbers.";
    public static final int RANGE_LIMIT_1 = 1;
    public static final int RANGE_LIMIT_100 = 100;

    public static void runGame() {
        Engine.runGame(GAME_DESCRIPTION, getGameData());
    }

    private static String[][] getGameData() {
        String[][] gameData = new String[Engine.COUNT_ROUND][2];
        for (int round = 0; round < Engine.COUNT_ROUND; round++) {
            gameData[round] = generateRoundData();
        }
        return gameData;
    }

    private static String[] generateRoundData() {
        String[] roundData = new String[2];
        int number1 = Utils.generateRandomNumber(RANGE_LIMIT_1, RANGE_LIMIT_100);
        int number2 = Utils.generateRandomNumber(RANGE_LIMIT_1, RANGE_LIMIT_100);
        roundData[0] = Integer.toString(number1) + ' ' + number2;
        roundData[1] = Integer.toString(calculateGCD(number1, number2));
        return roundData;
    }

    private static int calculateGCD(int number1, int number2) {
        int result = 0;
        int numberMin = Math.min(number1, number2);
        for (int i = 1; i <= numberMin; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                result = i;
            }
        }
        return result;
    }
}
