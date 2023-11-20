package com.wolfsurwail.kata.kyu8;

public class FakeBinary {
    public static String fakeBin(String numberString) {
        StringBuilder s = new StringBuilder();
        for (char c : numberString.toCharArray()) {
            if (Character.getNumericValue(c) < 5 ) {
                s.append(0);
            } else {
                s.append(1);
            }
        }
        return s.toString();
    }
}
