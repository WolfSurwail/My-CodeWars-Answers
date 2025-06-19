package com.wolfsurwail.kata.kyu6;


public class DetectPangram {
    public boolean check(String sentence) {
        boolean[] alphabet = new boolean[26];
        sentence = sentence.toLowerCase();

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (Character.isLetter(c)) {
                int index = c - 'a';
                alphabet[index] = true;
            }
        }
        for (boolean letter : alphabet) {
            if (!letter) {
                return false;
            }
        }
        return true;
    }
}
