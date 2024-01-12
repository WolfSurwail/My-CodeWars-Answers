package com.wolfsurwail.kata.kyu8;

public class CountTheMonkeys {
    public static int[] monkeyCount(final int n){
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i] = i + 1;
        }
        return ints;
    }
}
