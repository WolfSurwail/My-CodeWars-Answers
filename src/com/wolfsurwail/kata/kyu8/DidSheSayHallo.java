package com.wolfsurwail.kata.kyu8;

public class DidSheSayHallo {
    public static boolean validateHello(String greetings){
        greetings = greetings.toLowerCase();
        String[] arr = new String[] {"hello", "ciao", "salut", "hallo", "hola", "ahoj", "czesc"};
        for (String str: arr) {
            if (greetings.contains(str)) {
                return true;
            }
        }
        return false;
    }
}
