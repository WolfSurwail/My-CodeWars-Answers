package com.wolfsurwail.kata.kyu8;

public class FindNearestSquareNumber {
    public static int nearestSq(final int n){
        return (int) Math.pow(Math.round(Math.sqrt(n)),2);
    }
}
