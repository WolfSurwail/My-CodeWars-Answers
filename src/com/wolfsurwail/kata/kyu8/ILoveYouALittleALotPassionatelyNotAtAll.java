package com.wolfsurwail.kata.kyu8;

public class ILoveYouALittleALotPassionatelyNotAtAll {
    public static String howMuchILoveYou(int nb_petals) {
        return switch (nb_petals % 6) {
            case 1 -> "I love you";
            case 2 -> "a little";
            case 3 -> "a lot";
            case 4 -> "passionately";
            case 5 -> "madly";
            default -> "not at all";
        };
    }
}
