package com.wolfsurwail.kata.kyu8;

public class FindTheIntegral {
    public static String integrate(int coefficient, int exponent) {
        return coefficient / (exponent + 1) + "x^" + (exponent + 1);
    }
}
