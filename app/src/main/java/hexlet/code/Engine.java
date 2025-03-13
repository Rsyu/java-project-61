package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;

import java.util.Scanner;

public class Engine {

    // Метод для запуска игры по имени
    public static void startGame(String gameName) {
        Scanner scanner = new Scanner(System.in);

        // Приветствие
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        // В зависимости от игры, вызываем соответствующий метод
        switch (gameName) {
            case "greet":
                Cli.greet();
                break;
            case "even":
                EvenGame.playEvenGame();
                break;
            case "calc":
                CalcGame.playCalcGame();
                break;
            default:
                System.out.println("Invalid game.");
        }
    }
}
