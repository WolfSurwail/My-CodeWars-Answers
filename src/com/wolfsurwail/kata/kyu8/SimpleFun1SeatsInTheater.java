package com.wolfsurwail.kata.kyu8;

public class SimpleFun1SeatsInTheater {
    public static int seatsInTheater(int nCols, int nRows, int col, int row) {
        return (nCols-col+1)*(nRows-row);
    }
}
