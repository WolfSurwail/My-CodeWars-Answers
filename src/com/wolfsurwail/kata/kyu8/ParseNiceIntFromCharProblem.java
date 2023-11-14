package com.wolfsurwail.kata.kyu8;

public class ParseNiceIntFromCharProblem {
    public static int howOld(final String herOld) {
        char[] chars = herOld.toCharArray();
        return Integer.parseInt(String.valueOf(chars[0]));
    }
}
