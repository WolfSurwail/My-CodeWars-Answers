package com.wolfsurwail.kata.kyu8;

public class TheFeastOfManyBeasts {
    public static boolean feast(String beast, String dish) {
        return beast.charAt(0) == dish.charAt(0) && beast.charAt(beast.length() - 1) == dish.charAt(dish.length()-1);
    }
}
