package com.company;

public class GameLogic extends Game {

     int getMatchesCountThatLeftOnTheTable() {
        countMatches -= removeMatches;
        return countMatches;
    }

}
