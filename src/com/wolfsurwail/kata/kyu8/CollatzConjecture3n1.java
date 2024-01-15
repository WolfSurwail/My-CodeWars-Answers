package com.wolfsurwail.kata.kyu8;

public class CollatzConjecture3n1 {
    public static int hotpo(int n) {
        int a = 0;
        while (n != 1) {
            n = n % 2 == 1 ? 3 * n + 1 : n / 2; a++;
        }
        return a;
    }
}
