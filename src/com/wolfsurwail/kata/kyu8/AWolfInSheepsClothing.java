package com.wolfsurwail.kata.kyu8;

public class AWolfInSheepsClothing {
    public static String warnTheSheep(String[] array) {
        int indexWolf = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("wolf")) {
                indexWolf = i;
            }
        }
        if (indexWolf == array.length - 1) {
            return "Pls go away and stop eating my sheep";
        } else {
            int sheep = array.length - indexWolf - 1;
            return "Oi! Sheep number " + sheep + "! You are about to be eaten by a wolf!";
        }
    }
}
