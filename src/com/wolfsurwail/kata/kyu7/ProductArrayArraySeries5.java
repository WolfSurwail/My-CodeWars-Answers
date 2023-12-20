package com.wolfsurwail.kata.kyu7;

public class ProductArrayArraySeries5 {
    public static long[] productArray(int[] numbers) {
        long l = 1;
        long[] longs = new long[numbers.length];
        for (int a : numbers) {
            l *= a;
        }
        for (int i = 0; i < numbers.length; i++) {
            longs[i] = l / numbers[i];
        }
        return longs;
    }
}
