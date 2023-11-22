package com.wolfsurwail.kata.kyu7;

public class PrinterErrors {
    public static String printerError(String s) {
        return s.replaceAll("[a-m]", "").length() + "/" + s.length();
    }

}
