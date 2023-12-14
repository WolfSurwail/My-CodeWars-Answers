package com.wolfsurwail.kata.kyu7;

public class SmallestValueOfAnArray {
    public static int findSmallest( final int[] numbers, final String toReturn ) {
        int index = 0;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
                index = i;
            }
        }
        return toReturn.equals("index") ? index : smallest;
    }
}
