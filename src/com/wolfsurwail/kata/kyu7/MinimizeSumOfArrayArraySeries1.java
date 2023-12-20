package com.wolfsurwail.kata.kyu7;

public class MinimizeSumOfArrayArraySeries1 {
    public static int minSum(int[] passed) {
        java.util.Arrays.sort(passed);
        int min = 0;
        int r = passed.length - 1;
        for (int i = 0; i < passed.length / 2; i++) {
            min += passed[i] * passed[r - i];
        }
        return min;
    }
}
