package com.company;

public class Game {
    static int countMatches = 20;
    static int[] winNumber = {17, 13, 9, 5};
    static int turn = 1;
    static int removeMatches = 0;


    public static void main(String[] args) {
        ComputerLogic computerLogic = new ComputerLogic();
        Console consoleLogic = new Console();
        GameLogic gameLogic = new GameLogic();
        while (countMatches > 1) {
            consoleLogic.matchesCountOnTable();
            consoleLogic.textRemoveMatches(computerLogic);
            turn++;

            countMatches = gameLogic.getMatchesCountThatLeftOnTheTable();
            if (countMatches == 1) {
                consoleLogic.matchesCountOnTable();
                consoleLogic.winText();
            }
        }
    }
}
