package com.wolfsurwail.kata.kyu7;

import java.util.*;

public class Testing123 {
    public static List<String> number(List<String> lines) {
        for (int i = 0; i < lines.size(); i++) {
            lines.set(i,i+1 + ": " + lines.get(i));
        }
        return lines;
    }
}
