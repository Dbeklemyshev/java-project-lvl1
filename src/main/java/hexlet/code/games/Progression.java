package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Arrays;

public class Progression {
    public static final String GAME_DESCRIPTION = "What number is missing in this progression?";
    public static final int ARRAY_LENGTH = 10;
    public static final int RANGE_LIMIT_0 = 0;
    public static final int RANGE_LIMIT_100 = 100;
    public static final int RANGE_LIMIT_10 = 10;

    public static void runGame() {
        Engine.runGame(GAME_DESCRIPTION, getGameData());
    }

    private static String getQuestion(int[] array, int missNumber) {
        StringBuilder progression = new StringBuilder();
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            if (i > 0) {
                progression = progression.append(" ");
            }
            if (i == missNumber) {
                progression.append("..");
            } else {
                progression.append(array[i]);
            }
        }
        return progression.toString();
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
        int diffValue = Utils.generateRandomNumber(RANGE_LIMIT_0, RANGE_LIMIT_10);
        int toMissArrayIndex = Utils.generateRandomNumber(RANGE_LIMIT_0, ARRAY_LENGTH - 1);
        int startValue = Utils.generateRandomNumber(RANGE_LIMIT_0, RANGE_LIMIT_100);
        int[] array = generateProgression(startValue, diffValue, ARRAY_LENGTH);
        roundData[0] = getQuestion(array, toMissArrayIndex);
        roundData[1] = Integer.toString(array[toMissArrayIndex]);
        return roundData;
    }

    private static int[] generateProgression(int startValue, int diffValue, int arrLength) {
        int[] array = new int[arrLength];
        array[0] = startValue;
        for (int i = 1; i < arrLength; i++) {
            array[i] = array[i - 1] + diffValue;
        }
        System.out.println("RESULT ARRAY: " + Arrays.toString(array));
        return array;
    }
}
