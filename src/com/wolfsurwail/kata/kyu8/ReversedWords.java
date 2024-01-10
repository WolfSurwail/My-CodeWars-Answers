package com.wolfsurwail.kata.kyu8;
import java.util.*;

public class ReversedWords {
    public static String reverseWords(String str){
        List<String> Words = Arrays.asList(str.split(" "));
        Collections.reverse(Words);
        return String.join(" ", Words);
    }
}
