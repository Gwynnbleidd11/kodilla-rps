package org.example.rps;

import java.util.Random;

public class GameLogic {

    private int playerPoints;
    private int cpuPoints;
    private int howManyPointsToWin;
    private String playerMove;

    public String computerMove() {
        Random random = new Random();
        Moves.moves move;
        int cpuMove = random.nextInt(3);
        if (cpuMove == 0) {
            move = Moves.moves.ROCK;
            System.out.println("Computer played ROCK");
        } else if ( cpuMove == 1) {
            move = Moves.moves.PAPER;
            System.out.println("Computer played PAPER");
        } else {
            move = Moves.moves.SCISSORS;
            System.out.println("Computer played SCISSORS");
        }
        return String.valueOf(move);
    }

    public void displayScore() {
        System.out.println("Wins required to win the game " + howManyPointsToWin);
        System.out.println("Player points: " + playerPoints);
        System.out.println("Computer points: " + cpuPoints);
    }

    public boolean checkForRoundWin() {
        String computerMove = computerMove();
        if (playerMove.equals("ROCK") && computerMove.equals("SCISSORS")) {
            System.out.println("Player wins!");
            playerPoints++;
            return true;
        } else if (playerMove.equals("PAPER") && computerMove.equals("ROCK")) {
            System.out.println("Player wins!");
            playerPoints++;
            return true;
        } else if (playerMove.equals("SCISSORS") && computerMove.equals("PAPER")) {
            System.out.println("Player wins!");
            playerPoints++;
            return true;
        } else if (computerMove.equals("ROCK") && playerMove.equals("SCISSORS")) {
            System.out.println("Computer wins!");
            cpuPoints++;
            return true;
        } else if (computerMove.equals("PAPER") && playerMove.equals("ROCK")) {
            System.out.println("Computer wins!");
            cpuPoints++;
            return true;
        } else if (computerMove.equals("SCISSORS") && playerMove.equals("PAPER")) {
            System.out.println("Computer wins!");
            cpuPoints++;
            return true;
        } else {
            System.out.println("Its a draw");
            return false;
        }
    }

    public boolean checkForGameWin() {
        if (playerPoints >= howManyPointsToWin) {
            System.out.println("Congratulations! Player wins entire game!");
            return true;
        } else if (cpuPoints >= howManyPointsToWin) {
            System.out.println("Computer wins entire game!");
            return true;
        } else return false;
    }

    public int getPlayerPoints() {
        return playerPoints;
    }

    public void setPlayerPoints(int playerPoints) {
        this.playerPoints = playerPoints;
    }

    public int getCpuPoints() {
        return cpuPoints;
    }

    public void setCpuPoints(int cpuPoints) {
        this.cpuPoints = cpuPoints;
    }

    public int getHowManyPointsToWin() {
        return howManyPointsToWin;
    }

    public void setHowManyPointsToWin(int howManyPointsToWin) {
        this.howManyPointsToWin = howManyPointsToWin;
    }

    public String getPlayerMove() {
        return playerMove;
    }

    public void setPlayerMove(String playerMove) {
        this.playerMove = playerMove;
    }
}
