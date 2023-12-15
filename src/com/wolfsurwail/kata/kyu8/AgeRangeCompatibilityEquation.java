package com.wolfsurwail.kata.kyu8;

public class AgeRangeCompatibilityEquation {
    public static String datingRange(int age) {
        return age <= 14 ? (int) (age - 0.1 * age) + "-" + (int) (age + 0.1 * age) : (age / 2 + 7) + "-" + (age - 7)*2;
    }
}
