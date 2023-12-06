package com.wolfsurwail.kata.kyu8;

public class RemoveTheTime {
    public static String shortenToDate(String longDate) {
        return longDate.substring(0,longDate.length()-5).replace(",","");
    }
}
