package com.wolfsurwail.kata.kyu7;

public class SimpleRemoveDuplicates {
    public static int [] solve(int [] arr){
        var list = new java.util.ArrayList<Integer>();
        for (int a : arr) {
            list.removeIf(elem -> elem == a);
            list.add(a);
        }
        return list.stream().mapToInt(elem -> elem).toArray();
    }
}
