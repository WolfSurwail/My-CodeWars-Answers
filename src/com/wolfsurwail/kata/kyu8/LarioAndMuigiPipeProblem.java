package com.wolfsurwail.kata.kyu8;

import java.util.stream.IntStream;

public class LarioAndMuigiPipeProblem {
    public static int[] pipeFix(int[] numbers) {
        return IntStream.rangeClosed(numbers[0], numbers[numbers.length - 1]).toArray();
    }
}
