package com.wolfsurwail.kata.kyu8;

public class FindTheFirstNonConsecutiveNumber {
    static Integer find(final int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] - 1 != array[i-1]) {
                return array[i];
            }
        }
        return null;
    }
}
