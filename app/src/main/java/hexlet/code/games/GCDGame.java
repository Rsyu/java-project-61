package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCDGame {
    private static final int ROUNDS_COUNT = 3;
    private static final int MAX_NUMBER = 100; // Исправлено
    private static final String GAME_RULE = "Find the greatest common divisor of given numbers.";

    public static void start() {
        String[][] roundsData = new String[ROUNDS_COUNT][2];

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int number1 = Utils.getRandomNumber(1, MAX_NUMBER);
            int number2 = Utils.getRandomNumber(1, MAX_NUMBER);

            String question = number1 + " " + number2;
            String correctAnswer = String.valueOf(findGCD(number1, number2));

            roundsData[i][0] = question;
            roundsData[i][1] = correctAnswer;
        }

        Engine.run(GAME_RULE, roundsData);
    }

    private static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
