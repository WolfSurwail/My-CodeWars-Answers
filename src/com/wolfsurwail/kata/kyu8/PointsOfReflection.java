package com.wolfsurwail.kata.kyu8;

public class PointsOfReflection {
    public static int[] reflectPoint(int[] p, int[] q){
        int[] b = {0,0};
        b[0] = q[0] * 2 - p[0];
        b[1] = q[1] * 2 - p[1];

        return b;
    }
}
