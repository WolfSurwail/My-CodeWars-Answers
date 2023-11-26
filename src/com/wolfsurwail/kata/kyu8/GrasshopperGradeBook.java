package com.wolfsurwail.kata.kyu8;

public class GrasshopperGradeBook {
    public static char getGrade(int s1, int s2, int s3) {
        int sum = (s1 + s2 + s3) / 3;
        if (90 <= sum && sum <= 100) {
            return 'A';
        } else if (80 <= sum && sum < 90) {
            return 'B';
        } else if (70 <= sum && sum < 80) {
            return 'C';
        } else if (60 <= sum && sum < 70) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
