package com.wolfsurwail.kata.kyu8;

public class HowManyStairsWillSuzukiClimbIn20Years {
    public static long stairsIn20(int[][] stairs) {
        long oneYear = 0;
        for (int[] stair : stairs) {
            for (int i : stair) {
                oneYear += i;
            }
        }
        return oneYear*20;
    }
}
