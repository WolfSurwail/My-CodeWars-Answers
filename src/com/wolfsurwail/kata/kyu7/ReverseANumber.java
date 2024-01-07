package com.wolfsurwail.kata.kyu7;

public class ReverseANumber {
    public static int reverse(int number) {
        StringBuilder stringBuilder;
        if (number < 0) {
            stringBuilder = new StringBuilder(String.valueOf(number * -1));
        } else {
            stringBuilder = new StringBuilder(String.valueOf(number));
        }
        return number > 0 ? Integer.parseInt(stringBuilder.reverse().toString()) : -1 * Integer.parseInt(stringBuilder.reverse().toString());
    }
}
