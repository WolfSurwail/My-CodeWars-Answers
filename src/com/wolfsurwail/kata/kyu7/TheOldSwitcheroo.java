package com.wolfsurwail.kata.kyu7;

public class TheOldSwitcheroo {
    public static String vowel2Index(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if ("aeiouAEIOU".indexOf(s.charAt(i)) == -1) {
                stringBuilder.append(s.charAt(i));
            } else {
                stringBuilder.append(i + 1);
            }
        }
        return stringBuilder.toString();
    }
}
