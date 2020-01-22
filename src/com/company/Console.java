package com.company;

import java.util.Scanner;

public class Console extends Game {

    void matchesCountOnTable() {
        System.out.println("На столе осталось спичек: " + countMatches);
    }

    void textRemoveMatches(ComputerLogic computerLogic, GameLogic gameLogic) {
        Scanner scanner = new Scanner(System.in);
        if (turn % 2 != 0) {
            System.out.println("-Количество спичек выбраных компьютером: " + computerLogic.getMatchesCountThatComputerTakesToLeaveWinningMatchesCountOnTable());
        } else {
            System.out.print("-Количество спичек выбранных игроком: ");
            removeMatches = scanner.nextInt();
            gameLogic.setMatchesCountThatGamerTakes(removeMatches);
        }
    }

    void winText() {
        System.out.println("Для игрока осталось одна спичка. Компьютер победил!");
    }
}