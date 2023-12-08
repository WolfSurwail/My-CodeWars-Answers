package com.wolfsurwail.kata.kyu7;

public class MaxDiffEasy {
    public static int maxDiff(int[] lst) {
        java.util.Arrays.sort(lst);
        return lst.length > 0 ? lst[lst.length - 1] - lst[0] : 0;
    }
}
