package com.wolfsurwail.kata.kyu7;

public class FindTheStrayNumber {
    static int stray(int[] numbers) {
        int dif = 0;
        if (numbers[0] != numbers[1] && numbers[0] != numbers[2]){
            dif = numbers[0];
            return dif;
        }
        for (int number : numbers) {
            if (numbers[0] != number) {
                dif = number;
            }
        }
        return dif;
    }
}
