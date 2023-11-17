package com.wolfsurwail.kata.kyu8;

public class BeginnerLostWithoutAMap {
    public static int[] map(int[] arr) {
        int[] ints = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ints[i] = arr[i] * 2;
        }
        return ints;
    }
}
