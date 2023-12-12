package com.wolfsurwail.kata.kyu8;

import java.util.function.IntPredicate;
import static java.util.stream.IntStream.of;

public class EnumerableMagic1TrueForAll {
    public static boolean all(int[] list, IntPredicate predicate){
        return of(list).allMatch(predicate);
    }
}
