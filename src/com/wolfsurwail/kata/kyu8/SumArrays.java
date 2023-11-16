package com.wolfsurwail.kata.kyu8;

import java.nio.file.Path;

public class SumArrays {
    public static double sum(double[] numbers) {
        double sum = 0;
        if (numbers != null || numbers.length > 0) {
            for (double a : numbers) {
                sum += a;
            }
        }
        return sum;
    }
}
