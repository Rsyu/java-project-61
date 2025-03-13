package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class EvenGame {

    public static void playEvenGame() {
        Scanner scanner = new Scanner(System.in);

        // Приветствие
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        // Игровой процесс
        int correctAnswersCount = 0;

        while (correctAnswersCount < 3) {
            int question = new Random().nextInt(100); // Генерация случайного числа от 0 до 99
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine().trim().toLowerCase();

            // Проверка правильности ответа
            String correctAnswer = (question % 2 == 0) ? "yes" : "no";

            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }

        // Вывод победы
        System.out.println("Congratulations, " + name + "!");
    }
}
