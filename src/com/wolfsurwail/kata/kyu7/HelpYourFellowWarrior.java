package com.wolfsurwail.kata.kyu7;

public class HelpYourFellowWarrior {
    public static String getHonorPath(int honorScore, int targetHonorScore) {
        return targetHonorScore <= honorScore ? "" : "2kyus: " + ((targetHonorScore - honorScore) % 2) + ", 1kyus: " + ((targetHonorScore - honorScore) / 2);
    }
}
