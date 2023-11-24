package com.wolfsurwail.kata.kyu8;

public class WelcomeToTheCity {
    public String sayHello(String [] name, String city, String state){
        return name.length > 2 ? "Hello, "+ name[0] + " " + name[1] + " " + name[2] +"! Welcome to "+city+", "+ state +"!" : "Hello, "+ name[0] + " " + name[1] +"! Welcome to "+city+", "+ state +"!";
    }
}
