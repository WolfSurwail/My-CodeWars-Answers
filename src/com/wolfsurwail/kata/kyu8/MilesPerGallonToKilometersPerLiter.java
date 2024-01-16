package com.wolfsurwail.kata.kyu8;

public class MilesPerGallonToKilometersPerLiter {
    public static float mpgToKPM(final float mpg) {
        return (float) Math.round(100 * mpg * 1.609344 / 4.54609188) / 100;
    }
}
