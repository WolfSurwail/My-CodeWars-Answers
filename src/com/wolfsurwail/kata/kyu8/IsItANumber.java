package com.wolfsurwail.kata.kyu8;

public class IsItANumber {
    public boolean isDigit(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
