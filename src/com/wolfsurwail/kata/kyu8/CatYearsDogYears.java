package com.wolfsurwail.kata.kyu8;

public class CatYearsDogYears {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        if (humanYears == 1) {
            return new int[]{humanYears,15,15};
        } else if (humanYears == 2) {
            return new int[]{humanYears,15+9,15+9};
        } else {
            return new int[]{humanYears,24+4*(humanYears-2),24+5*(humanYears -2)};
        }
    }
}
