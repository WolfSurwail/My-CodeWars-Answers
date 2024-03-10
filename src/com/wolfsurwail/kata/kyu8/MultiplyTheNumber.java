package com.wolfsurwail.kata.kyu8;

public class MultiplyTheNumber {
    public static int multiply(int number) {
        return number > 0 ? (int) Math.pow(5, String.valueOf(number).length()) * number : (int) Math.pow(5, String.valueOf(number).length() - 1) * number;
    }
}
