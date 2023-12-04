package com.wolfsurwail.kata.kyu7;

public class SortedYesNoHow {
    public static String isSortedAndHow(int[] array) {
        if (array.length <= 1) {
            if (array[0] < array[1]) {
                return "yes, ascending";
            } else if (array[0] > array[1]) {
                return "yes, descending";
            } else {
                return "no";
            }
        } else if (array.length == 2) {
                if (array[0] < array[1]) {
                    return "yes, ascending";
                } else if (array[0] > array[1]) {
                    return "yes, descending";
                } else {
                    return "no";
                }
        } else {

            if (array[0] < array[1] && array[1] < array[2]) {
                return "yes, ascending";
            } else if (array[0] > array[1] && array[1] > array[2]) {
                return "yes, descending";
            } else {
                return "no";
            }
        }
    }
}
