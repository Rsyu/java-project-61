package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class PrimeGame {
    private static final int ROUNDS_COUNT = 3;
    private static final int MAX_NUMBER = 100;

    public static void start() {
        String[][] roundsData = new String[ROUNDS_COUNT][2];

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int number = Utils.getRandomNumber(1, MAX_NUMBER);
            String correctAnswer = isPrime(number) ? "yes" : "no";
            roundsData[i][0] = String.valueOf(number);
            roundsData[i][1] = correctAnswer;
        }

        Engine.run("Answer 'yes' if given number is prime. Otherwise answer 'no'.", roundsData);
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
