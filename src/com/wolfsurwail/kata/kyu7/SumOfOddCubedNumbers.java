package com.wolfsurwail.kata.kyu7;

public class SumOfOddCubedNumbers {
    public static int cubeOdd(int arr[]) {
        int sum = 0;
        for (int i : arr){
            if( i*i*i % 2 != 0)
                sum += i*i*i;
        }
        return sum;
    }
}
