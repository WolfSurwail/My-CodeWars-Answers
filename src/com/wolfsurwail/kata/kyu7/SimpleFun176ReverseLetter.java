package com.wolfsurwail.kata.kyu7;

public class SimpleFun176ReverseLetter {
    public static String reverseLetter(final String str) {
        return new StringBuilder(str.replaceAll("[^a-zA-Z]", "")).reverse().toString();
    }
}
