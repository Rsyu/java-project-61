package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.EvenGame;
import hexlet.code.games.CalcGame;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Показываем меню выбора игры
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int choice = Integer.parseInt(scanner.nextLine());

        // В зависимости от выбора запускаем соответствующую игру
        switch (choice) {
            case 1:
                Cli.greet(); // Приветствие
                break;
            case 2:
                EvenGame.playEvenGame(); // Игра "Проверка на четность"
                break;
            case 3:
                CalcGame.playCalcGame(); // Игра "Калькулятор"
                break;
            case 0:
                System.out.println("Exiting..."); // Завершаем программу
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}
