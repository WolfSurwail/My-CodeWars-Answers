package com.wolfsurwail.kata.kyu8;

public class BeConciseIVIndexOfAnElementInAnArray {
    static String kata(String[] a, String s) {
        int i = java.util.List.of(a).indexOf(s);
        return i < 0 ? "Not found" : i + "";
    }
}
