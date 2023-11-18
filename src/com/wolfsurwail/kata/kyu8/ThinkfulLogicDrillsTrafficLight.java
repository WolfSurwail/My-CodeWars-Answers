package com.wolfsurwail.kata.kyu8;

public class ThinkfulLogicDrillsTrafficLight {
    public static String updateLight(String current) {
        if (current.equals("red")) {
            return "green";
        } else if (current.equals("green")) {
            return "yellow";
        } else {
            return "red";
        }
    }
}
