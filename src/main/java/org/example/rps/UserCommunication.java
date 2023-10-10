package org.example.rps;

import java.util.Scanner;

public class UserCommunication {

    public static void selectMove(GameLogic gl) {
        Scanner scan = new Scanner(System.in);
        String decision;
        while (true) {
            System.out.println("Select 1 for ROCK, 2 for PAPER, 3 for SCISSORS");
            System.out.println("If you would like to end the game, press 'x'. If you would like to start again, press 'n'");
            decision = scan.nextLine();
            if (decision.equals("1")) {
                System.out.println("You have played ROCK");
                gl.setPlayerMove("ROCK");
                break;
            } else if (decision.equals("2")) {
                System.out.println("You have played PAPER");
                gl.setPlayerMove("PAPER");
                break;
            } else if (decision.equals("3")) {
                System.out.println("You have played SCISSORS");
                gl.setPlayerMove("SCISSORS");
                break;
            } else if (decision.equals("x") || decision.equals("X")) {
                System.out.println("Are you sure, you would like to end the game? Type yes or no.");
                String endGameDecision = scan.nextLine();
                while (true) {
                    if (endGameDecision.equals("yes") || endGameDecision.equals("YES") || endGameDecision.equals("Yes")) {
                        System.out.println("Game ended");
                        return;
                    } else break;
                }
            } else if (decision.equals("n") || decision.equals("N")) {
                System.out.println("Are you sure you would like to start new game? All points will be erased. Type yes or no");
                String newGameDecision = scan.nextLine();
                while (true) {
                    if (newGameDecision.equals("yes") || newGameDecision.equals("YES") || newGameDecision.equals("Yes")) {
                        System.out.println("Game ended, starting new game.");
                        gl.setPlayerPoints(0);
                        gl.setCpuPoints(0);
                        //how to restart the game?
                        System.exit(0);
                    } else break;
                }
            }
        }
    }

    public static int toHowManyWins(GameLogic gl) {
        Scanner scan = new Scanner(System.in);
        int decision;
        while (true) {
            System.out.println("Enter number, to how many wins would you like to play");
            decision = scan.nextInt();
            scan.nextLine();
            if (decision < 1) {
                System.out.println("Number of rounds cannot be smaller than 1, try again");
            } else {
                System.out.println("You will be playing to " + decision + " wins. Good luck");
                gl.setHowManyPointsToWin(decision);
                break;
            }
        }
        return decision;
    }
}

