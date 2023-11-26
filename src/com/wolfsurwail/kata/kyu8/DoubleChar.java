package com.wolfsurwail.kata.kyu8;

public class DoubleChar {
    public static String doubleChar(String s){
            StringBuilder s1 = new StringBuilder();
            for (char a : s.toCharArray()) {
                s1.append(a);
                s1.append(a);
            }
            return s1.toString();
    }
}
