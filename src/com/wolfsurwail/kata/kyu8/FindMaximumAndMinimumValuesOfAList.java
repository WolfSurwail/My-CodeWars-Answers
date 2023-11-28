package com.wolfsurwail.kata.kyu8;


public class FindMaximumAndMinimumValuesOfAList {
    public int min(int[] list) {
        return java.util.Arrays.stream(list).min().getAsInt();
    }

    public int max(int[] list) {
        return java.util.Arrays.stream(list).max().getAsInt();
    }
}
