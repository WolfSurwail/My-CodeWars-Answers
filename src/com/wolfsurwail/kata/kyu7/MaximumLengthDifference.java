package com.wolfsurwail.kata.kyu7;

public class MaximumLengthDifference {
    public static int mxdiflg(String[] a1, String[] a2) {
        int r = -1;
        for (String x : a1) {
            for (String y : a2) {
                r =  Math.max(r,Math.abs(x.length() - y.length()));
            }
        }
        return r;
    }
}
