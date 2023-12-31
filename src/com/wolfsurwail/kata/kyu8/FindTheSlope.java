package com.wolfsurwail.kata.kyu8;

public class FindTheSlope {
    public String slope(int[] points) {
        return points[0] == points[2] ? "undefined" : String.valueOf ((points[1]-points[3])/(points[0]-points[2]));
    }
}
