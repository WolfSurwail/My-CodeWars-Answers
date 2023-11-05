package com.wolfsurwail.kata.kyu6;

public class FindTheUniqueNumber {
    public static double findUniq(double arr[]) {
        double n = 0;

        if (arr[0] != arr[1] && arr[0] != arr[2]) {
            n = arr[0];
        } else {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] != arr[0]) {
                    n = arr[i];
                    break;
                }
            }
        }
        return n;
    }
}
