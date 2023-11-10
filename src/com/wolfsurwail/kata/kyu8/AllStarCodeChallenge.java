package com.wolfsurwail.kata.kyu8;

public class AllStarCodeChallenge {
    public static int strCount(String str, char letter) {
        int a = 0;
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if (c == letter) {
                a++;
            }
        }
        return a;
    }
}
