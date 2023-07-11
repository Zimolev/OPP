package org.example.SeminarThree.Game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Logger logger = new Logger();
        try {
            gameStarted(logger);
        } catch (Exception exception) {
            logger.logging("Error:", exception);
        }
    }

    private static void gameStarted(Logger logger) {
        Scanner scanner = new Scanner(System.in);
        logger.logging("Start game", null);
        NumberGame numberGame = new NumberGame(choiceGame());
        System.out.println("Введите максимальный размер загаданного слова или кол- во цифр");
        int wordSize = scanner.nextInt();
        System.out.println("Введите максимальное количество попыток угадать загаданное слово или число");
        int maxTry = scanner.nextInt();
        numberGame.start(wordSize, maxTry);
        logger.logging("Computer word: ***" + " NumTry: " + numberGame.currentTry, null);
        scanner.nextLine();
        while (!numberGame.getGameStatus().equals(GameStatus.FINISH)) {
            String value = scanner.nextLine();
            Answer answer = numberGame.inputValue(value);
            if (answer != null) {
                logger.logging("Answer: " + value + " NumTry: " + answer.getNumTry(), null);
                System.out.println("Коров - " + answer.getCow()
                        + ", быков - " + answer.getBull() +
                        ", попытка - " + answer.getNumTry());
            }
        }
        logger.logging("Computer word: " + numberGame.getComputerWord(), null);
        logger.logging("Game status: " + numberGame.getGameStatus(), null);

        System.out.println("Начать еще игру? Да - 1, Нет - 0");
        int input = scanner.nextInt();
        if (input == 1) gameStarted(logger);
        else if (input == 0) {
            System.out.println("Пока!");
        }
    }

    public static Integer choiceGame() {
        System.out.println("Выбери настройки игры. 1 - цифры, 2 - русский язык, 3 - английский язык, 4 - слова ");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        return userChoice;
        }
}

