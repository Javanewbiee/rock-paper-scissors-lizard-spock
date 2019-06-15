package com.rpsls;

public class GameRunner {

    public static void main(String[] args) {

        boolean end = false;

        System.out.println("|---------------------------------------------|");
        System.out.println("| Welcome to Rock Paper Scissors Lizard Spock |");
        System.out.println("|---------------------------------------------|");
        System.out.println();
        System.out.println(" 1 - Rock, 2 - Paper, 3 - Scissors, 4 - Lizard, 5 - Spock \n x - End game, n - New game");
        System.out.println();

        while (end == false) {
            Game game = new Game();
            game.startGame();
            end = game.gameEnding();
        }
    }
}
