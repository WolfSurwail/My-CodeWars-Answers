package com.wolfsurwail.kata.kyu7;

public class RoundUpToTheNextMultipleOf5 {
    public static int roundToNext5(int number) {
        while (number % 5 != 0) {
            number++;
        }
        return number;
    }
}
