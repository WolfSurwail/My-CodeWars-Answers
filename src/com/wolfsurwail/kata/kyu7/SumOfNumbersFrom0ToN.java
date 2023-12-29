package com.wolfsurwail.kata.kyu7;

public class SumOfNumbersFrom0ToN {
    public static String showSequence(int value){
        if (value < 0) {
            return value + "<0";
        }
        if (value == 0) {
            return value + "=" + value;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int sum = 0;
        for (int i = 0; i < value; i++) {
            stringBuilder.append(i).append("+");
            sum += i;
        }
        sum += value;
        stringBuilder.append(value).append(" = ").append(sum);
        return stringBuilder.toString();
    }
}
