package com.wolfsurwail.kata.kyu7;

public class FixStringCase {
    public static String solve(final String str) {
        int lower = 0;
        for (Character c: str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lower++;
            }
        }
        return str.length() - lower > lower ? str.toUpperCase() : str.toLowerCase();
    }
}
