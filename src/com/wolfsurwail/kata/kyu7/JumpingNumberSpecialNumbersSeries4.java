package com.wolfsurwail.kata.kyu7;

public class JumpingNumberSpecialNumbersSeries4 {
    public static String jumpingNumber(int number) {
        char[] chars = Integer.toString(number).toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] != chars[i+1] + 1 && chars[i] != chars[i+1] - 1) {
                return "Not!!";
            }
        }
        return "Jumping!!";
    }
}
