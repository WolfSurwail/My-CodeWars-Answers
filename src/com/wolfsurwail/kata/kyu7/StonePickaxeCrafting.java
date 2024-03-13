package com.wolfsurwail.kata.kyu7;

public class StonePickaxeCrafting {
    public static int stonePick(String[] arr) {
        int Cobblestone = 0;
        int Sticks = 0;
        int Wood  = 0;
        for (String s : arr) {
            if (s.equals("Cobblestone")) {
                Cobblestone++;
            } if (s.equals("Sticks")){
                Sticks++;
            } if (s.equals("Wood")){
                Wood++;
            }
        }
        Sticks += Wood * 4;
        Cobblestone /= 3;
        Sticks /= 2;
        return Math.min(Cobblestone,Sticks);
    }
}
