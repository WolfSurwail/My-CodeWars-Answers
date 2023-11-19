package com.wolfsurwail.kata.kyu8;

public class RemovingElements {
    public static Object[] removeEveryOther(Object[] arr) {
        Object[] out = new Object[(arr.length + 1) / 2];

        for (int i = 0; i < out.length; i++) {
            out[i] = arr[i * 2];
        }

        return out;
    }
}
