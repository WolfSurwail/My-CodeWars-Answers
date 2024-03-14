package com.wolfsurwail.kata.kyu7;

public class CatYearsDogYears2 {
    public static int[] ownedCatAndDog(final int catYears, final int dogYears) {
        final int ownedCat = catYears < 15 ? 0 : catYears < 24 ? 1 : 2 + (catYears-24)/4;
        final int ownedDog = dogYears < 15 ? 0 : dogYears < 24 ? 1 : 2 + (dogYears-24)/5;
        return new int[]{ownedCat, ownedDog};



    }
}
