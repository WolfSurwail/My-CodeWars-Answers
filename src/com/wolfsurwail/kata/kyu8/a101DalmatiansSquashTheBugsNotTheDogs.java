package com.wolfsurwail.kata.kyu8;
public class a101DalmatiansSquashTheBugsNotTheDogs {
    static String howManyDalmatians (int number) {
        return number <= 10 ? "Hardly any" : number <= 50 ? "More than a handful!" : number == 101 ? "101 DALMATIANS!!!" : "Woah that's a lot of dogs!";
    }
}
