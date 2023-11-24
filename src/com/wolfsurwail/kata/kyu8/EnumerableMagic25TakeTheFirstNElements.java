package com.wolfsurwail.kata.kyu8;

public class EnumerableMagic25TakeTheFirstNElements {
    public static int[] take(int[] arr, int n) {
        return n > arr.length ? arr : java.util.Arrays.copyOf(arr,n);
    }
}
