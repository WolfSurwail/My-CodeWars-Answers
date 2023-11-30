package com.wolfsurwail.kata.kyu8;

public class SumOfMultiples {
    public static long sumMul(int n, int m) throws IllegalArgumentException {
        if (n < 1 || m < 1) {
            throw new IllegalArgumentException("n or m < 1");
        }
        int s = (m - 1) / n;
        return (long) (n * 0.5 * s * (s + 1));
    }
}
