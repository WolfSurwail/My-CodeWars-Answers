package com.wolfsurwail.kata.kyu7;

public class SumOfTheFirstNthTermOfSeries {
    public static String seriesSum(int n) {
        double u = 1;
        int j = 4;
        for (int i = 0; i < n; i++) {
            if (i >= 1) {
                u += 1.0/j;
                j += 3;
            }
        }
        return String.format("%.2f", u);
    }
}
