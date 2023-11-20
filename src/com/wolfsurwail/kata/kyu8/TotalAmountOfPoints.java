package com.wolfsurwail.kata.kyu8;

public class TotalAmountOfPoints {
    public static int points(String[] games) {
        int counts = 0;
        for(String s : games) {
            char x = s.charAt(0), y = s.charAt(2);
            counts += x > y ? 3 : x == y ? 1 : 0;
        }

        return counts;
    }
}
