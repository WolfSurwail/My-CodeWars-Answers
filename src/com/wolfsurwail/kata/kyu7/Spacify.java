package com.wolfsurwail.kata.kyu7;

public class Spacify {
    public static String spacify(String str){
        char[] chars = str.toCharArray();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < chars.length - 1; i++) {
            s.append(chars[i]).append(" ");
        }
        s.append(chars[chars.length - 1]);
        return s.toString();
    }
}
