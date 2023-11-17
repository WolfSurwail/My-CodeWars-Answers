package com.wolfsurwail.kata.kyu8;

public class SquareNSum {
    public static int squareSum(int[] n) {
        int sum = 0;
        for (int j : n) {
            sum += j * j;
        }
        return sum;
    }
}
