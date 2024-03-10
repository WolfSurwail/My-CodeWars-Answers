package com.wolfsurwail.kata.kyu8;

import java.awt.*;
import java.util.ArrayList;

public class FindNumbersWhichAreDivisibleByGivenNumber {
    public static int[] divisibleBy(int[] numbers, int divider) {
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int number : numbers) {
            if (number % divider == 0) {
                resultList.add(number);
            }
        }
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }
        return resultArray;
    }
}
