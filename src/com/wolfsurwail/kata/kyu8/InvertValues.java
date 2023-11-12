package com.wolfsurwail.kata.kyu8;

public class InvertValues {
    public static int[] invert(int[] array) {
        int index = 0;
        for (int i : array) {
            array[index] = -i;
            index++;
        }
        return array;
    }
}
