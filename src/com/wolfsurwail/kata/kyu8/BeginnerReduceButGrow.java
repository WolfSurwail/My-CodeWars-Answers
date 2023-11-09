package com.wolfsurwail.kata.kyu8;

public class BeginnerReduceButGrow {
    public static int grow(int[] x){
        int sum = 1;
        for (int g : x) {
            sum *= g;
        }
        return sum;
    }
}
