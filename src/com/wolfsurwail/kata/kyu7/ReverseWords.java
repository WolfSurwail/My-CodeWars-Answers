package com.wolfsurwail.kata.kyu7;

public class ReverseWords {
    public static String reverseWords(final String original) {
        String[] strings = original.split(" ");

        if (strings.length == 0) {
            return original;
        }

        int index = 0;
        for (String s: strings) {
            strings[index] = new StringBuilder(s).reverse().toString();
            index++;
        }
        return String.join(" ", strings);
    }
}
