package com.wolfsurwail.kata.kyu7;

import static java.util.Arrays.stream;

public class FormTheMinimum {
    public static int minValue(int[] values){
        return stream(values).distinct().sorted().reduce(0 , (a,b) -> 10 * a + b);
    }
}
