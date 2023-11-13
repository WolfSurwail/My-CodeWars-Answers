package com.wolfsurwail.kata.kyu8;

public class NoZerosForHeros {
    public static int noBoringZeros(int n) {
        if (n == 0) {
            return n;
        } else {
            String s = String.valueOf(n);
            while (s.charAt(s.length() - 1) == '0' ) {
                s = s.substring(0, s.length() - 1);
            }
            return Integer.parseInt(s);
        }
    }
}
