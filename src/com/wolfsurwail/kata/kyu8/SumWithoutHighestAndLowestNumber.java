package com.wolfsurwail.kata.kyu8;

import java.util.Arrays;

public class SumWithoutHighestAndLowestNumber {
    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length <= 1) {
            return 0;
        }
        int max = Arrays.stream(numbers).max().getAsInt();
        int min = Arrays.stream(numbers).min().getAsInt();
        int sum = 0;
        for (int i: numbers) {
            sum += i;
        }
        return sum - min - max;
    }
}
