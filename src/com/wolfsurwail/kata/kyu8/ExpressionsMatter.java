package com.wolfsurwail.kata.kyu8;

public class ExpressionsMatter {
    public static int expressionsMatter(int a, int b, int c) {
        int[] myArray = {a+b+c, a*b*c, a+b*c, a*b+c, (a+b)*c, a*(b+c)};
        int max = 0;
        for (int j : myArray) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}
