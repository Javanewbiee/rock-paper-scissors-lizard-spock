package com.rpsls;

import java.util.Random;

public class Opponent {

    int score = 0;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Integer opponentPick() {
        Random generator = new Random();
        int pick = generator.nextInt(6) + 1;
        System.out.println("Opponent pick: ");
        if (pick == 1) {
            System.out.println("ROCK");
            return 1;
        } else if (pick == 2) {
            System.out.println("PAPER");
            return 2;
        } else if (pick == 3){
            System.out.println("SCISSORS");
            return 3;
        }else if (pick == 4) {
            System.out.println("LIZARD");
            return 4;
        }else {
            System.out.println("SPOCK");
            return 5;
        }
    }
}
