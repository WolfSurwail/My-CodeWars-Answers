package com.wolfsurwail.kata.kyu8;

public class StringyStrings {
    public static String stringy(int size) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                s.append("1");
            } else {
                s.append("0");
            }
        }
        return s.toString();
    }
}
