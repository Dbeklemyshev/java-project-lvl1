package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.games.Even.ANSWER_NO;
import static hexlet.code.games.Even.ANSWER_YES;


public class Prime {
    public static final String ENTER_TEXT = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void playGame() {
        Engine.runGame(ENTER_TEXT, getGameData());
    }
    private static String[] generateRoundData() {

        String[] roundData = new String[2];
        String trueAnswer;
        int number1 = Utils.getRandom(Utils.RANGE_LIMIT_1, Utils.RANGE_LIMIT_100);
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
        for(int i =2; i<number; i++){
            if(number%i==0){
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
