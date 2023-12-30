package com.wolfsurwail.kata.kyu7;

public class AlphabetWar {
    public static String alphabetWar(String fight){
        char[] chars = fight.toCharArray();
        int right = 0;
        int left = 0;
        for (char c : chars) {
            if (c == 'm') {
                right += 4;
            }
            if (c == 'q') {
                right += 3;
            }
            if (c == 'd') {
                right += 2;
            }
            if (c == 'z') {
                right += 1;
            }
            if (c == 'w') {
                left += 4;
            }
            if (c == 'p') {
                left += 3;
            }
            if (c == 'b') {
                left += 2;
            }
            if (c == 's') {
                left += 1;
            }
        }
        return right == left ? "Let's fight again!" : right > left ? "Right side wins!" : "Left side wins!";
    }
}
