package com.wolfsurwail.kata.kyu7;

public class RowWeights {
    public static int[] rowWeights (final int[] weights) {
        int a = 0, b = 0;
        for (int i = 0; i < weights.length; i++) {
            if (i % 2 == 0) {
                b += weights[i];
            } else {
                a += weights[i];
            }
        }
        return new int[]{b,a};
    }
}
