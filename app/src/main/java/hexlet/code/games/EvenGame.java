package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class EvenGame {
    private static final int MAX_NUMBER = 100; // Максимальное число
    private static final String GAME_RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void start() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2]; // Используем константу из Engine

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) { // Используем константу из Engine
            int number = Utils.getRandomNumber(1, MAX_NUMBER);
            String question = String.valueOf(number);
            String correctAnswer = (number % 2 == 0) ? "yes" : "no";

            roundsData[i][0] = question;
            roundsData[i][1] = correctAnswer;
        }

        Engine.run(GAME_RULE, roundsData);
    }
}
