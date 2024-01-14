package com.wolfsurwail.kata.kyu8;

public class WellOfIdeasEasyVersion {
    public static String well(String[] x) {
        int good = 0;
        for (String s : x) {
            if (s.equals("good")) {
                good++;
            }
        }
        return good > 0 && good <= 2 ? "Publish!" : good > 2 ? "I smell a series!" : "Fail!";
    }
}
