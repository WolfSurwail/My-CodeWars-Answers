package com.wolfsurwail.kata.kyu8;

public class GrassHopperSummation {
    public static int summation(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
