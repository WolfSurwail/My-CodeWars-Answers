package com.wolfsurwail.kata.kyu7;

import java.util.Arrays;

public class JadenCasingStrings {
    public String toJadenCase(String phrase) {
        if ( phrase == null || phrase.isEmpty()) {
            return null;
        }
        String[] strings = phrase.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : strings) {
            stringBuilder.append(Character.toUpperCase(string.charAt(0))).append(string.substring(1)).append(" ");
        }
        return stringBuilder.toString().trim();
    }

}
