package com.wolfsurwail.kata.kyu8;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortMyTextbooks {
    public static List<String> sort(List<String> textbooks) {
        textbooks.sort(String.CASE_INSENSITIVE_ORDER);
        return textbooks;
    }
}
