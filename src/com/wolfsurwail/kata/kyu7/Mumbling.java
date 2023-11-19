package com.wolfsurwail.kata.kyu7;

public class Mumbling {
    public static String accum(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;
        for(char c : s.toCharArray()) {
            if(index > 0) stringBuilder.append('-');
            stringBuilder.append(Character.toUpperCase(c));
            for(int i = 0; i < index; i++) stringBuilder.append(Character.toLowerCase(c));
            index++;
        }
        return stringBuilder.toString();
    }
}
