package com.wolfsurwail.kata.kyu8;

public class GetTheMeanOfAnArray {
    public static int getAverage(int[] marks){
        int res = 0;
        for (int mark : marks) {
            res += mark;
        }
        return  res / marks.length;
    }
}
