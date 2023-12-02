package com.wolfsurwail.kata.kyu7;

public class DeodorantEvaporator {
    public static int evaporator(double content, double evap_per_day, double threshold) {
        int i = 0;
        double p = 100;
        while (p > threshold) {
            p *= 1 - evap_per_day/100;
            i++;
        }
        return i;
    }
}
