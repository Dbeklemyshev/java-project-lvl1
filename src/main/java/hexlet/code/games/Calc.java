package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Calc {
    public static final String GAME_DESCRIPTION = "What is the result of the expression?";
    public static final int RANGE_LIMIT_0 = 0;
    public static final int RANGE_LIMIT_100 = 100;
    private static char[] operationArray = {'+', '-', '*'};

    public static void runGame() {
        String[][] gameData = new String[Engine.COUNT_ROUND][2];
        for (int round = 0; round < Engine.COUNT_ROUND; round++) {
            gameData[round] = generateRoundData();
        }
        Engine.runGame(GAME_DESCRIPTION, gameData);
    }

    private static int calculate(int input1, int input2, char operation) {
        return switch (operation) {
            case '+' -> input1 + input2;
            case '-' -> input1 - input2;
            case '/' -> input1 / input2;
            case '*' -> input1 * input2;
            default ->  throw new Error("Unknown operation type: " + operation + "!");
        };
    }

    private static char generateOperation() {
        return operationArray[Utils.generateRandomNumber(RANGE_LIMIT_0, operationArray.length - 1)];
    }

    private static String[] generateRoundData() {
        String[] roundData = new String[2];
        int number1 = Utils.generateRandomNumber(RANGE_LIMIT_0, RANGE_LIMIT_100);
        int number2 = Utils.generateRandomNumber(RANGE_LIMIT_0, RANGE_LIMIT_100);
        char operation = generateOperation();
        int trueAnswer = calculate(number1, number2, operation);
        roundData[0] = Integer.toString(number1) + ' ' + operation + ' ' + number2;
        roundData[1] = Integer.toString(trueAnswer);
        return roundData;
    }

}
