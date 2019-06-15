package com.rpsls;

public class Score {

    public void actualizeScore(int result,Player player, Opponent opponent) {
        if ( result == 0) {
            System.out.println("This round is a draw!");
        }else if (result == 1) {
            System.out.println("You win this round!");
            int playerScore = player.getScore();
            playerScore++;
            player.setScore(playerScore);
        }else {
            System.out.println("Opponent wins this round!");
            int opponentScore = opponent.getScore();
            opponentScore++;
            opponent.setScore(opponentScore);
        }
    }
}
