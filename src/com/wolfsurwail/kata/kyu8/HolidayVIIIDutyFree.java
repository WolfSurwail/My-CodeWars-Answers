package com.wolfsurwail.kata.kyu8;

public class HolidayVIIIDutyFree {
    public static int dutyFree(int normPrice, int discount, int hol) {
        double savingPerBottle = normPrice * (discount / 100.0);
        return (int) (hol / savingPerBottle);
    }
}
