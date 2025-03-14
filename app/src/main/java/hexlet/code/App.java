package hexlet.code;

import hexlet.code.games.EvenGame;
import hexlet.code.games.CalcGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.ProgressionGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");

        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();

        switch (choice) {
            case "1" -> Cli.greet();
            case "2" -> EvenGame.start();
            case "3" -> CalcGame.start();
            case "4" -> GCDGame.start();
            case "5" -> ProgressionGame.start(); // Добавили арифметическую прогрессию
            case "0" -> System.out.println("Goodbye!");
            default -> System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
