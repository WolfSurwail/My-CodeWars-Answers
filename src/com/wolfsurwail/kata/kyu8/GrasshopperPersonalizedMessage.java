package com.wolfsurwail.kata.kyu8;

public class GrasshopperPersonalizedMessage {
    static String greet(String name, String owner) {
        return name.equalsIgnoreCase(owner) ? "Hello boss" : "Hello guest";
    }
}
