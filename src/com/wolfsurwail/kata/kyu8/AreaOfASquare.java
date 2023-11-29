package com.wolfsurwail.kata.kyu8;

public class AreaOfASquare {
    public static double squareArea(double A){
        return Double.parseDouble(String.format("%.2f", Math.pow((A * 4) / (Math.PI  * 2), 2)));
    }
}
