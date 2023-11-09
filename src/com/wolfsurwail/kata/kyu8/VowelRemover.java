package com.wolfsurwail.kata.kyu8;

public class VowelRemover {
    public static String shortcut(String input) {
        return  input.replaceAll("[aeiou]", "");
    }
}
