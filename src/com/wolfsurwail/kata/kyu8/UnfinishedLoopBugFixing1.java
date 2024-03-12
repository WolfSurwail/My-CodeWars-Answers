package com.wolfsurwail.kata.kyu8;
import java.util.*;

public class UnfinishedLoopBugFixing1 {
    public static List CreateList(int number) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            list.add(i);
        }
        return list;
    }
}
