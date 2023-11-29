package com.wolfsurwail.kata.kyu8;

public class SumOfDifferencesInArray {
    public static int sumOfDifferences(int[] arr) {
        int sum = 0;
        java.util.Arrays.sort(arr);
        for (int i = arr.length - 1; i > 0; i--) {
            sum += arr[i] - arr[i - 1];
        }
        return sum;
    }
}
