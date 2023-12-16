package com.wolfsurwail.kata.kyu7;

public class RotateForAMax {
    public static long maxRot (long n) {
        String s = Long.toString(n);
        for (int i = 0; i < s.length(); i++) {
            s = s.substring(0,i) + s.substring(1 + i) + s.charAt(i);
            if (Long.parseLong(s) > n) {
                n = Long.parseLong(s);
            }
        }
        return n;
    }
}
