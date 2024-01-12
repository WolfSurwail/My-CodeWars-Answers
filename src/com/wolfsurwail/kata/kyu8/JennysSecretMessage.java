package com.wolfsurwail.kata.kyu8;

public class JennysSecretMessage {
    public static String greet(String name) {
        return name.equals("Johnny") ? "Hello, my love!" : String.format("Hello, %s!", name);
    }
}
