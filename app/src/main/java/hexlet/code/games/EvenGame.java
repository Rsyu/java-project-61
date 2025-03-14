package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class EvenGame {
    private static final int ROUNDS_COUNT = 3;
    private static final String GAME_RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void start() { // <-- Убедись, что метод public
        String[][] roundsData = new String[ROUNDS_COUNT][2];

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int number = Utils.getRandomNumber(1, 100);
            String question = String.valueOf(number);
            String correctAnswer = (number % 2 == 0) ? "yes" : "no";

            roundsData[i][0] = question;
            roundsData[i][1] = correctAnswer;
        }

        Engine.run(GAME_RULE, roundsData);
    }
}
