package com.wolfsurwail.kata.kyu8;

public class HowGoodAreYouReally {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = 0;
        for (int i : classPoints) {
            sum += i;
        }
        return sum / classPoints.length < yourPoints;
    }
}
