package com.rpsls;

import java.util.Scanner;

public class Player {

    String name;
    int score = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Integer getPlayerPick() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Make your pick: ");
        int pick = scanner.nextInt();
        if (pick == 1) {
            System.out.println("ROCK");
            return  1;
        } else if (pick == 2) {
            System.out.println("PAPER");
            return 2;
        }else if (pick == 3){
            System.out.println("SCISSORS");
            return 3;
        } else if (pick == 4) {
            System.out.println("LIZARD");
            return 4;
        } else {
            System.out.println("SPOCK");
            return 5;
        }
    }
}
