package com.wolfsurwail.kata.kyu8;

import java.util.Arrays;

public class SortAndStar {
    public static String twoSort(String[] s) {
        Arrays.sort(s);
        char[] chars = s[0].toCharArray();
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < chars.length - 1; i++) {
            a.append(chars[i]).append("***");
        }
        a.append(chars[chars.length - 1]);
        return  a.toString();
    }
}
