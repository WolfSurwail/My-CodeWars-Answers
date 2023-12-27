package com.wolfsurwail.kata.kyu7;

public class FilterTheNumber {
    public static long filterString(final String value) {
        return Long.parseLong(value.replaceAll("[^0-9]", ""));
    }
}
