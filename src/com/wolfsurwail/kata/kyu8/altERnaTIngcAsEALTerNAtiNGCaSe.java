package com.wolfsurwail.kata.kyu8;

public class altERnaTIngcAsEALTerNAtiNGCaSe {
    public static String toAlternativeString(String string) {
        StringBuilder s = new StringBuilder();
        for (char c : string.toCharArray()) {
            if (Character.isLowerCase(c)) {
                s.append(Character.toUpperCase(c));
            } else {
                s.append(Character.toLowerCase(c));
            }
        }
        return s.toString();
    }
}
