package com.wolfsurwail.kata.kyu7;

public class MostDigits {
    public static int findLongest(int[] numbers) {
        int r = numbers[0];
        for (Integer i : numbers) {
            if(String.valueOf(r).replaceAll("-","").length() < String.valueOf(i).replaceAll("-", "").length()) {
                r = i;
            }
        }
        return  r;
    }
}
