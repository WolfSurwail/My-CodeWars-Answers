package com.wolfsurwail.kata.kyu7;

import static java.math.BigInteger.valueOf;

public class GreatestCommonDivisor {
    public static int compute(int x, int y) {
        return valueOf(x).gcd(valueOf(y)).intValue();
    }
}
