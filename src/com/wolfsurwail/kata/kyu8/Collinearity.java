package com.wolfsurwail.kata.kyu8;

public class Collinearity {
    public static boolean collinearity(int x1, int y1, int x2, int y2) {
        return x1 * y2 == y1 * x2;
    }
}
