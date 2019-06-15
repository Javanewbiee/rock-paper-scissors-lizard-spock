package com.rpsls;

import com.rpsls.choices.*;

import java.util.Comparator;
import java.util.Scanner;

public class Game {

    boolean end;

    public void startGame() {
        System.out.println("Type your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("To how many wins will you play?");
        int wins = scanner.nextInt();

        System.out.println();
        System.out.println("Here is few things you need to know:\nScissors cuts Paper\nPaper covers Rock\nRock crushes Lizard\nLizard poisons Spock\nSpock smashes Scissors\nScissors decapitates Lizard\nLizard eats Paper\nPaper disproves Spock\nSpock vaporizes Rock\nand as it always has Rock crushes Scissors");
        System.out.println();
        System.out.println("Good Luck and Have Fun");

        Player player = new Player(name);
        Opponent opponent = new Opponent();
        Score score = new Score();

        System.out.println("Player " + name + " Score: " + player.getScore());
        System.out.println();
        System.out.println("Opponent: Super AI you wont be able to beat" + "\nScore:" + opponent.getScore());

        while (player.getScore() < wins && opponent.getScore() < wins) {
            Integer playerChoice = player.getPlayerPick();
            Integer opponentChoice = opponent.opponentPick();
            if (playerChoice == 1) {
                Comparator rock = new Rock();
                int compared = rock.compare(playerChoice,opponentChoice);
                score.actualizeScore(compared,player,opponent);
            }else if (playerChoice == 2) {
                Comparator paper = new Paper();
                int compared = paper.compare(playerChoice,opponentChoice);
                score.actualizeScore(compared,player,opponent);
            }else if (playerChoice == 3) {
                Comparator scissors = new Scissors();
                int compared = scissors.compare(playerChoice,opponentChoice);
                score.actualizeScore(compared,player,opponent);
            }else if (playerChoice == 4) {
                Comparator lizard = new Lizard();
                int compared = lizard.compare(playerChoice,opponentChoice);
                score.actualizeScore(compared,player,opponent);
            }else {
                Comparator spock = new Spock();
                int compared = spock.compare(playerChoice,opponentChoice);
                score.actualizeScore(compared,player,opponent);
            }
            System.out.println();
            System.out.println("Player " + player.getName() + " Score: " + player.getScore());
            System.out.println();
            System.out.println("Opponent: Super AI you wont be able to beat" + "\nScore:" + opponent.getScore());
            System.out.println();
        }
    }
    public boolean gameEnding() {
        System.out.println("Do you want to end or continue the game?");
        Scanner scan = new Scanner(System.in);
        String gameChoice = scan.nextLine();
        if (gameChoice.equals("x") ) {
            System.out.println("Are you sure you want to end the game?");
            String gameChoice1 = scan.nextLine();
            if (gameChoice1.equals("x")) {
                end = true;
            } else {
                end = false;
            }
        } else {
            end = false;
        }return end;
    }
}
