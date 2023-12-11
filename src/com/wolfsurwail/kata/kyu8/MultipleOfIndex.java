package com.wolfsurwail.kata.kyu8;

public class MultipleOfIndex {
    public static int[] multipleOfIndex(int[] array) {
        return java.util.stream.IntStream.range(0,array.length).filter(i->i==0?array[0]==0:array[i]%i==0).map(i->array[i]).toArray();
    }
}
