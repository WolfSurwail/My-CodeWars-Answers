package com.wolfsurwail.kata.kyu7;

import java.util.List;
import org.apache.commons.lang3.tuple.Pair;

public class OrderedCountOfCharacters {
    public static List<Pair<Character, Integer>> orderedCount(String text) {
        List<Pair<Character, Integer>> r = new java.util.ArrayList<>();
        int l = text.length();
        while(text.length() > 0) {
            Character key = text.charAt(0);
            text = text.replaceAll(String.valueOf(key), "");
            r.add(Pair.of(key, l - text.length()));
            l = text.length();
        }
        return r;
    }
}
