package com.wolfsurwail.kata.kyu7;

import java.util.*;

public class DigitalСypher {
    public static int[] encode(String str, int key) {
        List<Integer> result = new ArrayList<>();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < str.length(); i++) {
            int charIndex = alphabet.indexOf(str.charAt(i)) + 1;
            int keyDigit = Character.getNumericValue(String.valueOf(key).charAt(i % String.valueOf(key).length()));
            result.add(charIndex + keyDigit);
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
