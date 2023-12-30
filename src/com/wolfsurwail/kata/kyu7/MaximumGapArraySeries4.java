package com.wolfsurwail.kata.kyu7;

public class MaximumGapArraySeries4 {
    public static int maxGap(int[] numbers) {
        java.util.Arrays.sort(numbers);
        int max = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] - numbers[i - 1] > max)
                max = numbers[i] - numbers[i - 1];
        }
        return max;
    }
}
