package com.wolfsurwail.kata.kyu8;

public class WhatIsBetween {
    public static int[] between(int a, int b) {
        int[] aA = new int[b - a + 1];
        for (int i = 0; a <= b; i++) {
            aA[i] = a;
            a++;
        }
        return aA;
    }
}
