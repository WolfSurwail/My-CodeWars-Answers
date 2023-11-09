package com.wolfsurwail.kata.kyu8;

public class CorrectTheMistakesOfTheCharacterRecognitionSoftware {
    public static String correct(String string) {
        return string.replace('5', 'S').replace('0', 'O').replace('1', 'I');
    }
}
