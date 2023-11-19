package com.wolfsurwail.kata.kyu8;

public class PowersOf2 {
    public static long[] powersOfTwo(int n){
        long[] longs = new long[n + 1];
        int index = 1;
        for (int i = 0; i <= n; i++) {
            longs[i] = (long) Math.pow(2,i);
        }
        return longs;
    }
}
