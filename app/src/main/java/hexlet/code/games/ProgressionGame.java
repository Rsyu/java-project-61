package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class ProgressionGame {
    private static final int MIN_PROGRESSION_LENGTH = 5;
    private static final int MAX_STEP = 20;
    private static final int MIN_LENGTH = 5; // Исправлено
    private static final int MAX_LENGTH = 10; // Исправлено
    private static final String GAME_RULE = "What number is missing in the progression?";

    public static void start() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int start = Utils.getRandomNumber(1, MAX_STEP); // Исправлено
            int step = Utils.getRandomNumber(1, MAX_STEP); // Исправлено
            int length = Utils.getRandomNumber(MIN_LENGTH, MAX_LENGTH); // Исправлено
            int hiddenIndex = Utils.getRandomNumber(0, length - 1); // Оставляем как есть

            String[] progression = generateProgression(start, step, length);
            String correctAnswer = progression[hiddenIndex];
            progression[hiddenIndex] = "..";

            String question = String.join(" ", progression);
            roundsData[i][0] = question;
            roundsData[i][1] = correctAnswer;
        }

        Engine.run(GAME_RULE, roundsData);
    }

    private static String[] generateProgression(int start, int step, int length) {
        String[] progression = new String[length];
        for (int i = 0; i < length; i++) {
            progression[i] = String.valueOf(start + i * step);
        }
        return progression;
    }
}
