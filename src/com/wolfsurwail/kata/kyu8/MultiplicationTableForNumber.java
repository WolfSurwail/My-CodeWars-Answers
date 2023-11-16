package com.wolfsurwail.kata.kyu8;

public class MultiplicationTableForNumber {
    public static String multiTable(int num) {
        String s = "";
        for (int i = 1; i <= 10; i++) {
            s += i + " * " + num + " = " + i*num + ((i < 10) ? "\n" : "");
        }
        return s;
    }
}
