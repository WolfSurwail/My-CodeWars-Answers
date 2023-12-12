package com.wolfsurwail.kata.kyu8;

public class PrintingArrayElementsWithCommaDelimiters {
    public static String printArray(Object[] array) {
        return java.util.Arrays.toString(array).replaceAll("^\\[|\\]$", "").replaceAll(" ", "");
    }
}
