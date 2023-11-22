package com.wolfsurwail.kata.kyu7;

import java.util.List;

public class OnesAndZeros {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        String s = "";
        for (int i : binary) {
            s += String.valueOf(i);
        }
        return  Integer.parseInt(s, 2);
    }
}
