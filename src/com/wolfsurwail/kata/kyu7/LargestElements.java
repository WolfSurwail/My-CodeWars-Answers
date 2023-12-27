package com.wolfsurwail.kata.kyu7;

public class LargestElements {
    public static int[] largest(int n, int[] arr) {
        java.util.Arrays.sort(arr);
        return java.util.Arrays.copyOfRange(arr,arr.length-n,arr.length);
    }
}
