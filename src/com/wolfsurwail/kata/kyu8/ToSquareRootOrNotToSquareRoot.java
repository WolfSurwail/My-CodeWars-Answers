package com.wolfsurwail.kata.kyu8;

public class ToSquareRootOrNotToSquareRoot {
    public static int[] squareOrSquareRoot(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (Math.sqrt(array[i]) % 1 == 0) {
                array[i] = (int) Math.sqrt(array[i]);
            } else {
                array[i] = (int) Math.pow(array[i],2);
            }
        }
        return array;
    }
}
