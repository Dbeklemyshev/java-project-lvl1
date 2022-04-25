package hexlet.code.games;


import hexlet.code.Engine;
import hexlet.code.Utils;


public class Calc {
    public static final String ENTER_TEXT = "What is the result of the expression?";
    private static char[] operationArray = {'+', '-', '*'};

    public static void playGame() {
        Engine.runGame(ENTER_TEXT, getGameData());
    }

    private static int calculate(int input1, int input2, char operation) {
        switch (operation) {
            case '+':
                return input1 + input2;
            case '-':
                return input1 - input2;
            case '/':
                return input1 / input2;
            case '*':
                return input1 * input2;
            default:
                return Integer.MIN_VALUE;
        }
    }

    private static char getOperation() {
        return operationArray[Utils.getRandom(Utils.RANGE_LIMIT_0, operationArray.length - 1)];
    }

    private static String[] generateRoundData() {
        String[] roundData = new String[2];
        int number1 = Utils.getRandom(Utils.RANGE_LIMIT_0, Utils.RANGE_LIMIT_100);
        int number2 = Utils.getRandom(Utils.RANGE_LIMIT_0, Utils.RANGE_LIMIT_100);
        char operation = getOperation();
        int trueAnswer = calculate(number1, number2, operation);
        roundData[0] = Integer.toString(number1) + ' ' + operation + ' ' + number2;
        roundData[1] = Integer.toString(trueAnswer);
        return roundData;
    }

    private static String[][] getGameData() {
        String[][] gameData = new String[Engine.COUNT_ROUND][2];
        for (int round = 0; round < Engine.COUNT_ROUND; round++) {
            gameData[round] = generateRoundData();
        }
        return gameData;
    }
}