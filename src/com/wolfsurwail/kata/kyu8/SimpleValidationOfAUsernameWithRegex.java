package com.wolfsurwail.kata.kyu8;

public class SimpleValidationOfAUsernameWithRegex {
    public static boolean validateUsr(String s) {
        return s.matches("[a-z_\\d]{4,16}");
    }
}
