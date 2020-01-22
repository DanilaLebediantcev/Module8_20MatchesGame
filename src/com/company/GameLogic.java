package com.company;

import java.util.Scanner;

public class GameLogic extends Game {

     void setMatchesCountThatGamerTakes(int countOfMatchesThatGamerTakes) {
        try {
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < 1; ) {
                if (countOfMatchesThatGamerTakes <= 3 && countOfMatchesThatGamerTakes > 0) {
                    i++;
                } else {
                    System.out.print("Указано неверное количество спичек! Можно забирать максимум 3 спички. Введите число заново:");
                    countOfMatchesThatGamerTakes = scanner.nextInt();
                }
            }
        } catch (NumberFormatException e) {
            System.out.print("Пожалуйста, вводите только числа! Числа можно вводить в диапазоне от 1 до 3.");
        }
    }

     int getMatchesCountThatLeftOnTheTable() {
        countMatches -= removeMatches;
        return countMatches;
    }

}
