package com.wolfsurwail.kata.kyu8;

public class ExclamationMarksSeries6RemoveNExclamationMarksInTheSentenceFromLeftToRight {
    public static String remove(String s, int n){
        for (int i = 0; i < n; i++) {
            s = s.replaceFirst("!","");
        }
        return s;
    }
}
