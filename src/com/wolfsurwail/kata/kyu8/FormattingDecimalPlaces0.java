package com.wolfsurwail.kata.kyu8;

public class FormattingDecimalPlaces0 {
    public static double TwoDecimalPlaces(double number)
    {
        return Double.parseDouble(String.format("%8.2f", number).replace(',', '.'));
    }
}
