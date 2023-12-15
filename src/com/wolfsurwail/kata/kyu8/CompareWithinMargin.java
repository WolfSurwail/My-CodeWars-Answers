package com.wolfsurwail.kata.kyu8;

public class CompareWithinMargin {
    public static int closeCompare(double a, double b) {
        return closeCompare(a,b,0);
    }

    public static int closeCompare(double a, double b, double margin) {
        return Math.abs(a - b) <= margin? 0 : a > b? 1 : -1;
    }
}
