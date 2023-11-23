package com.wolfsurwail.kata.kyu7;

import java.util.Arrays;

public class AnagramDetection {
    public static boolean isAnagram(String test, String original) {
        if (test == null || original == null || test.length() != original.length()) {
            return false;
        }
        char[] chars1 = test.toLowerCase().toCharArray();
        char[] chars2 = original.toLowerCase().toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1,chars2);
    }
}
