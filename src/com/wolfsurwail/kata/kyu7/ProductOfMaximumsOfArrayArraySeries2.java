package com.wolfsurwail.kata.kyu7;

public class ProductOfMaximumsOfArrayArraySeries2 {
    public static long maxProduct(int[] numbers, int sub_size) {
        java.util.Arrays.sort(numbers);
        long res = 1;
        for (int i = numbers.length - 1; sub_size > 0 ; i--,sub_size--) {
            res *= numbers[i];
        }
        return res;
    }
}
