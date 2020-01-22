package com.company;

public class ComputerLogic extends Game {

    int getMatchesCountThatComputerTakesToLeaveWinningMatchesCountOnTable() {
        for (int i = 0; i < winNumber.length; ) {
            if (countMatches > winNumber[i]) {
                removeMatches = countMatches - winNumber[i];
                i += 4;
            } else {
                removeMatches = countMatches - 1;
                i++;
            }
        }
        return removeMatches;
    }
}
