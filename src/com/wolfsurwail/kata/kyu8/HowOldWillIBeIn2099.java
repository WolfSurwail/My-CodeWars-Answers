package com.wolfsurwail.kata.kyu8;

public class HowOldWillIBeIn2099 {
    public static String CalculateAge(int birth, int yearTo) {
        String year = "year";
        if (yearTo - birth > 2 || -(yearTo -birth) > 2) {
            year += "s";
        }
        if (yearTo - birth == 0) {
            return "You were born this very year!";
        } else {
            return (yearTo - birth) > 0 ? "You are " + (yearTo - birth) + " "+year+" old." : "You will be born in " + - ( yearTo - birth) +" "+year+".";
        }
    }
}
