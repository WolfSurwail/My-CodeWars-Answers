package com.wolfsurwail.kata.kyu8;

public class ExclusiveLogicalOperatorXOR {
    public static boolean xor(boolean a, boolean b) {
        if ( !a && !b) {
            return false;
        } else if (a && !b) {
            return true;
        } else if (!a && b) {
            return true;
        } else {
            return false;
        }
    }
}
