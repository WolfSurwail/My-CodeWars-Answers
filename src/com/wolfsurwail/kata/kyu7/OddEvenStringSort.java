package com.wolfsurwail.kata.kyu7;

public class OddEvenStringSort {
    public static String sortMyString(String s) {
        char[] chars = s.toCharArray();
        StringBuilder s0 = new StringBuilder();
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0) {
                s0.append(chars[i]);
            } else {
                s1.append(chars[i]);
            }
        }
        return s0 + " " + s1;
    }
}
