package com.wolfsurwail.kata.kyu8;

public class ThinkfulNumberDrillsBlueAndRedMarbles {
    public static double guessBlue(int blueStart, int redStart, int bluePulled, int redPulled) {
        return (double) (blueStart -= bluePulled) / (blueStart + redStart - redPulled);
    }
}
