package com.rpsls.choices;

import java.util.Comparator;

public class Spock implements Choices, Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o2 == 1) {
            return 1;
        }else if (o2 == 2) {
            return -1;
        }else if (o2 == 3) {
            return 1;
        }else if (o2 == 4) {
            return -1;
        }else {
            return 0;
        }
    }
}