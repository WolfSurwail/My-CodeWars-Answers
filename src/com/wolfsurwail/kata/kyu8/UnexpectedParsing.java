package com.wolfsurwail.kata.kyu8;

import java.util.Map;

public class UnexpectedParsing {
    static Map <String, String> getStatus(boolean isBusy) {
        return Map.of("status", isBusy ? "busy" : "available");
    }
}
