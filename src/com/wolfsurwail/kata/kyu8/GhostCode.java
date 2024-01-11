package com.wolfsurwail.kata.kyu8;

public class GhostCode {
    public static String helloName(final String name){
        if(name == null || name.isEmpty())
            return "Hello world!";
        else
            return "Hello my name is " + name;
    }
}
