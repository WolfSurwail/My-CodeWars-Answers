package com.wolfsurwail.kata.kyu7;
import java.util.*;

public class ArrayLeadersArraySeries3 {
    public static List arrayLeaders(int[] numbers) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            int sum = 0;
            for (int j = i + 1; j < numbers.length; j++) {
                sum += numbers[j];
            }
            if (numbers[i] > sum) {
                res.add(numbers[i]);
            }
        }
        return res;
    }
}
