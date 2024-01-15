package com.wolfsurwail.kata.kyu8;


import org.apache.commons.lang3.ArrayUtils;

public class GravityFlip {
    public static int[] flip(char dir, int[] arr) {
        java.util.Arrays.sort(arr);
        if (dir =='L')
            ArrayUtils.reverse(arr);
        return arr;
    }
}
