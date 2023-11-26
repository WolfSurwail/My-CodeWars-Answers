package com.wolfsurwail.kata.kyu7;

public class AlternateCapitalization {
    public static String[] capitalize(String s){
        if (s == null || s.length() == 0) {
            return new String[0];
        }
        StringBuilder toLower = new StringBuilder();
        StringBuilder toUpper = new StringBuilder();
        int index = 0;
        for (char c : s.toCharArray()) {
            if (index % 2 == 0) {
                toLower.append(Character.toUpperCase(c));
                toUpper.append(Character.toLowerCase(c));
            } else {
                toUpper.append(Character.toUpperCase(c));
                toLower.append(Character.toLowerCase(c));
            }
            index++;
        }
        return new String[]{toLower.toString(),toUpper.toString()};
    }
}
