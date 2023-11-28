package com.wolfsurwail.kata.kyu8;


public class GrasshopperArrayMean {
    public static int findAverage(int[] nums) {
        if (nums == null){
            return 0;
        }
        if (nums.length < 1) {
            return 1;
        }
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        return sum / nums.length;
    }
}
