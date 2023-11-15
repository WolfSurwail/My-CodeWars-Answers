package com.wolfsurwail.kata.kyu8;

import java.util.Arrays;

public class ConvertNumberToReversedArrayOfDigits {
    public static int[] digitize(long n) {
        return new StringBuilder().append(n)
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }
}
