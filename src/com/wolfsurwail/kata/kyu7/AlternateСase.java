package com.wolfsurwail.kata.kyu7;

public class AlternateСase {
    static String alternateCase(final String string) {
        char[] chars = string.toCharArray();
        StringBuilder s = new StringBuilder();
        for (char c : chars) {
            if (Character.isLowerCase(c)) {
                s.append(Character.toUpperCase(c));
            } else {
                s.append(Character.toLowerCase(c));
            }
        }
        return s.toString();
    }
}
