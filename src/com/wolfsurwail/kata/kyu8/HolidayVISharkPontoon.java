package com.wolfsurwail.kata.kyu8;

public class HolidayVISharkPontoon {
    public static String shark(int pontoonDistance, int sharkDistance, int youSpeed, int sharkSpeed, boolean dolphin) {
        if (pontoonDistance/youSpeed < sharkDistance/sharkSpeed){
            return "Alive!";
        } else if (dolphin && (double) pontoonDistance/youSpeed < sharkDistance/(0.5*sharkSpeed)){
            return "Alive!";
        } else{
            return "Shark Bait!";
        }
    }
}
