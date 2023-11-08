package com.wolfsurwail.kata.kyu7;

public class CountTheDivisorsOfANumber {
    public long numberOfDivisors(int n) {
        int r = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                r++;
            }
        }
        return r;
    }
}
