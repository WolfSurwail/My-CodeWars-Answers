package com.wolfsurwail.kata.kyu7;

public class SmallEnoughBeginner {
    public static boolean smallEnough(int[] a, int limit) {
        for (int i : a) {
            if (i > limit) {
                return false;
            }
        }
        return true;
    }
}
