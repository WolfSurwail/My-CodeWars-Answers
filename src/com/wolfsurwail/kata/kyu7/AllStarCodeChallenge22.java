package com.wolfsurwail.kata.kyu7;

public class AllStarCodeChallenge22 {
    public static String toTime(int seconds){
        int h = seconds / 3600;
        int m = (seconds - h * 3600) / 60;
        return h + " hour(s) and "+m+" minute(s)";
    }
}
