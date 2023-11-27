package com.wolfsurwail.kata.kyu8;

public class QuarterOfTheYear {
    public static int quarterOf(int month) {
        if (month > 9 ) {
            return 4;
        } else if (month > 6) {
            return 3;
        } else if (month > 3) {
            return 2;
        } else {
            return 1;
        }
    }
}
