package com.wolfsurwail.kata.kyu7;

public class TheHighestProfitWins {
    public static int[] minMax(int[] arr) {
        return new int[] {java.util.Arrays.stream(arr).min().getAsInt(),java.util.Arrays.stream(arr).max().getAsInt() };
    }
}
