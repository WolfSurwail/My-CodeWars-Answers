package com.wolfsurwail.kata.kyu7;

public class Move10 {
    public static String moveTen(String s) {
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isLetter(charArray[i])) {
                char base = Character.isUpperCase(charArray[i]) ? 'A' : 'a';
                charArray[i] = (char) (base + (charArray[i] - base + 10) % 26);
            }
        }
        return new String(charArray);
    }
}
