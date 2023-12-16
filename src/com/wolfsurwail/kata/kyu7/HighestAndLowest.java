package com.wolfsurwail.kata.kyu7;

public class HighestAndLowest {
    public static String highAndLow(String numbers) {
        String[] strings = numbers.split("[,\\s]+");
        int[] ints = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }
        return java.util.Arrays.stream(ints).max().getAsInt() + " " + java.util.Arrays.stream(ints).min().getAsInt();
    }
}
