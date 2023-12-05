package com.wolfsurwail.kata.kyu7;

public class BuildASquare {
    public static final String generateShape(int n) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                s.append("+".repeat(n));
            } else {
                s.append("+".repeat(n)).append("\n");
            }
        }
        return s.toString();
    }
}
