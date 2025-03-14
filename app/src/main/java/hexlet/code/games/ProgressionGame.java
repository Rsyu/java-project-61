package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class ProgressionGame {
    private static final int ROUNDS_COUNT = 3;
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;
    private static final String GAME_RULE = "What number is missing in the progression?";

    public static void start() {
        String[][] roundsData = new String[ROUNDS_COUNT][2];

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int start = Utils.getRandomNumber(1, 20); // Начало прогрессии
            int step = Utils.getRandomNumber(1, 5);   // Шаг прогрессии
            int length = Utils.getRandomNumber(MIN_LENGTH, MAX_LENGTH); // Длина прогрессии
            int hiddenIndex = Utils.getRandomNumber(0, length - 1); // Индекс скрытого числа

            String[] progression = generateProgression(start, step, length);
            String correctAnswer = progression[hiddenIndex];
            progression[hiddenIndex] = ".."; // Заменяем число на ".."

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
