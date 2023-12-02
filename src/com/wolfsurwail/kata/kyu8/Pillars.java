package com.wolfsurwail.kata.kyu8;

public class Pillars {
    public static int pillars(int numPill, int dist, int width){
        return numPill > 1 ? (numPill-1) * dist * 100 + (numPill-2) * width : 0;
    }
}
