package com.wolfsurwail.kata.kyu7;

public class HalvingSum {
    int halvingSum(int n) {
        int sum = n;
        while (n > 0) {
            sum += n / 2;
            n = n / 2;
        }
        return sum;
    }
}
