package com.wolfsurwail.kata.kyu7;

import java.util.Arrays;

public class HelpTheFruitGuy {
    public static String[] removeRotten(String[] fruitBasket) {
        return fruitBasket == null ? new String[0] : Arrays.stream(fruitBasket).map(s -> s.replace("rotten", "").toLowerCase()).toArray(String[]::new);
    }
}
