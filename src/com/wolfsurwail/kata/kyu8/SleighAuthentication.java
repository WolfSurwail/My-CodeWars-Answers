package com.wolfsurwail.kata.kyu8;

public class SleighAuthentication {
    public static Boolean authenticate(String name, String password){
        return name.equals("Santa Claus") && password.equals("Ho Ho Ho!");
    }
}
