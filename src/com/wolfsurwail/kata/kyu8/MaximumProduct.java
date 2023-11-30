package com.wolfsurwail.kata.kyu8;

public class MaximumProduct {
    public int adjacentElementsProduct(int[] array) {
        int s = Integer.MIN_VALUE;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] * array[i + 1] > s) {
                s = array[i] * array[i + 1];
            }
        }
        return s;
    }
}
