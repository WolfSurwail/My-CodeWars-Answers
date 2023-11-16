package com.wolfsurwail.kata.kyu8;

public class IfYouCantSleepJustCountSheep {
    public static String countingSheep(int num) {
        String sheep = " sheep...";
        String s = "";
        if (num > 0) {
            for (int i = 1; i <= num ; i++) {
                s += i + sheep;
            }
        }
        return s;
    }
}
