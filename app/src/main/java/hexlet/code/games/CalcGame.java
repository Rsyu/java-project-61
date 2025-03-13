package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class CalcGame {

    public static void playCalcGame() {
        Scanner scanner = new Scanner(System.in);

        // Приветствие
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("What is the result of the expression?");

        // Игровой процесс
        int correctAnswersCount = 0;
        Random random = new Random();

        while (correctAnswersCount < 3) {
            // Генерация случайного выражения
            int num1 = random.nextInt(50);
            int num2 = random.nextInt(50);
            char operator = generateRandomOperator();

            // Формируем вопрос
            String question = num1 + " " + operator + " " + num2;
            int correctAnswer = calculate(num1, num2, operator);

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().trim();

            // Проверка ответа
            try {
                if (Integer.parseInt(userAnswer) == correctAnswer) {
                    System.out.println("Correct!");
                    correctAnswersCount++;
                } else {
                    System.out.println("'" + userAnswer + "' is wrong answer ;(. "
                            + "Correct answer was '" + correctAnswer + "'.");
                    System.out.println("Let's try again, " + name + "!");
                    return;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
                return;
            }
        }

        // Победа
        System.out.println("Congratulations, " + name + "!");
    }

    // Генерация случайного оператора
    private static char generateRandomOperator() {
        char[] operators = {'+', '-', '*'};
        Random random = new Random();
        return operators[random.nextInt(operators.length)];
    }

    // Вычисление результата выражения
    private static int calculate(int num1, int num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            default:
                throw new IllegalArgumentException("Unsupported operator: " + operator);
        }
    }
}
