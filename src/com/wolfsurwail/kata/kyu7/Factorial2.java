package com.wolfsurwail.kata.kyu7;

public class Factorial2 {
    public static long factorial(int n) {
        long s = 1L;
        while (n != 0) {
            s *= n;
            n--;
        }
        return s;
    }
}
