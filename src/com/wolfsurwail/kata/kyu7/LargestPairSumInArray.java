package com.wolfsurwail.kata.kyu7;

public class LargestPairSumInArray {
    public static int largestPairSum(int[] numbers){
        java.util.Arrays.sort(numbers);
        return numbers[numbers.length - 2] + numbers[numbers.length -1];
    }
}
