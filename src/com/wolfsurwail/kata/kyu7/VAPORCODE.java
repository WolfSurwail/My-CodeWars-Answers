package com.wolfsurwail.kata.kyu7;

public class VAPORCODE {
    public static String vaporcode(String s) {
        s = s.replaceAll(" ", "").toUpperCase().replaceAll("", "  ");
        return s.substring(2,s.length() - 2);
    }
}
