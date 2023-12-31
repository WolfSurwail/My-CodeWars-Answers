package com.wolfsurwail.kata.kyu7;

public class FlattenAndSortAnArray {
    public static int[] flattenAndSort(int[][] array) {
        return java.util.Arrays.stream(array).flatMapToInt(java.util.Arrays::stream).sorted().toArray();
    }
}
