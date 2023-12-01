package com.wolfsurwail.kata.kyu8;

public class SurfaceAreaAndVolumeOfABox {
    public static int[] getSize(int w,int h,int d) {
        return new int[]{(2*w*h+2*w*d+2*h*d),w*d*h};
    }
}
