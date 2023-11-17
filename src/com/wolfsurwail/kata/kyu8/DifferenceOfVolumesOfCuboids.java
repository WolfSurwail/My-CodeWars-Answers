package com.wolfsurwail.kata.kyu8;

public class DifferenceOfVolumesOfCuboids {
    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        int sumA = 1;
        int sumB = 1;
        for (int i = 0; i < 3; i++) {
            sumA *= firstCuboid[i];
            sumB *= secondCuboid[i];
        }
        if (sumA > sumB) {
            return sumA - sumB;
        } else {
            return sumB - sumA;
        }
    }
}
