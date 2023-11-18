package com.wolfsurwail.kata.kyu8;


public class ANeedleInTheHaystack {
    public static String findNeedle(Object[] haystack) {
        return String.format("found the needle at position %d", java.util.Arrays.asList(haystack).indexOf("needle"));
    }
}
