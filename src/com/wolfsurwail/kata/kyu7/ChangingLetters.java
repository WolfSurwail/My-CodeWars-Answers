package com.wolfsurwail.kata.kyu7;

public class ChangingLetters {
    public static String swap(String st){
        return st.replaceAll("a", "A").replaceAll("e", "E").replaceAll("i", "I").replaceAll("o", "O").replaceAll("u","U");
    }
}
