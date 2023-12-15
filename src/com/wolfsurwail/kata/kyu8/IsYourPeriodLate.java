package com.wolfsurwail.kata.kyu8;
import java.time.*;
import static java.time.temporal.ChronoUnit.*;

public class IsYourPeriodLate {
    public static boolean periodIsLate(LocalDate last,LocalDate today,int cycleLength) {
        return DAYS.between(last,today) > cycleLength;
    }
}
