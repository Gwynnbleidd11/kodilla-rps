package org.example.rps;

import static org.example.rps.UserCommunication.*;

public class RpsRunner {
    public static void main(String[] args) {

        GameLogic gl = new GameLogic();
        boolean end = false;

        toHowManyWins(gl);
        while (!end) {
            selectMove(gl);
            if (gl.checkForRoundWin()) {
                gl.displayScore();
            }
            if (gl.checkForGameWin()) {
               break;
            }
        }
    }
}
