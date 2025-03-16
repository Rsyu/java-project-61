package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class CalcGame {
    private static final int ROUNDS_COUNT = 3;
    private static final int MAX_NUMBER = 20; // Исправлено
    private static final int OPERATORS_COUNT = 2; //  Исправлено
    private static final String GAME_RULE = "What is the result of the expression?";

    public static void start() {
        String[][] roundsData = new String[ROUNDS_COUNT][2];
        char[] operators = {'+', '-', '*'};

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int number1 = Utils.getRandomNumber(1, MAX_NUMBER);
            int number2 = Utils.getRandomNumber(1, MAX_NUMBER);
            char operator = operators[Utils.getRandomNumber(0, OPERATORS_COUNT)];

            String question = number1 + " " + operator + " " + number2;
            String correctAnswer = String.valueOf(calculate(number1, number2, operator));

            roundsData[i][0] = question;
            roundsData[i][1] = correctAnswer;
        }

        Engine.run(GAME_RULE, roundsData);
    }

    private static int calculate(int num1, int num2, char operator) {
        return switch (operator) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            default -> throw new RuntimeException("Unknown operator: " + operator);
        };
    }
}
