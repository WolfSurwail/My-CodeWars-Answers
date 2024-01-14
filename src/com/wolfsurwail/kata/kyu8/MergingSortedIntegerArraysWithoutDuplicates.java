package com.wolfsurwail.kata.kyu8;
import java.util.stream.*;

public class MergingSortedIntegerArraysWithoutDuplicates {
    public static int[] mergeArrays(int[] first, int[] second) {
        return IntStream.concat(IntStream.of(first),IntStream.of(second)).distinct().sorted().toArray();
    }
}
