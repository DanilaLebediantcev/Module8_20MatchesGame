package com.company;

import java.util.Scanner;

public class Console extends Game {

    int gamerMatches;

    void matchesCountOnTable() {
        System.out.println("На столе осталось спичек: " + countMatches);
    }

    void textRemoveMatches(ComputerLogic computerLogic) {
        if (turn % 2 != 0) {
            System.out.println("-Количество спичек выбраных компьютером: " + computerLogic.getMatchesCountThatComputerTakesToLeaveWinningMatchesCountOnTable());
        } else {
            System.out.print("-Количество спичек выбранных игроком: ");
            for (int i = 0; i < 1; ) {
                Scanner scanner = new Scanner(System.in);
                if (scanner.hasNextInt()) {
                    gamerMatches = scanner.nextInt();
                    if (gamerMatches <= 3 && gamerMatches > 0) {
                        i++;
                    } else if (gamerMatches > 3 || gamerMatches < 0) {
                        System.out.print("Указано неверное количество спичек! Можно забирать максимум 3 спички. Введите число заново: ");
                    }
                } else {
                    System.out.print("Вы ввели не число. Можно вводить только числа от 1 до 3. Пожалуйста повторите попытку: ");
                }
            }
        }
    }

    void winText() {
        System.out.println("Для игрока осталось одна спичка. Компьютер победил!");
    }
}