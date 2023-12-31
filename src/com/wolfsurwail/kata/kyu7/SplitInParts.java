package com.wolfsurwail.kata.kyu7;

public class SplitInParts {
    public static String splitInParts(String s, int partLength) {
        StringBuilder result = new StringBuilder();
        while (s.length() > partLength) {
            result.append(s, 0, partLength).append(" ");
            s = s.substring(partLength);
        }
        return result.append(s).toString();
    }
}
