package com.wolfsurwail.kata.kyu8;

public class AbbreviateATwoWordName {
    public static String abbrevName(String name) {
        String[] strings = name.toUpperCase().split(" ");
        return strings[0].charAt(0) + "." + strings[1].charAt(0);
    }
}
