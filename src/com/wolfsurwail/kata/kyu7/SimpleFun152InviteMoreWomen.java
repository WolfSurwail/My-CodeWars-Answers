package com.wolfsurwail.kata.kyu7;

public class SimpleFun152InviteMoreWomen {
    public static boolean inviteMoreWomen(int[] l) {
        int sum = 0;
        for (int i : l) {
            sum += i;
        }
        return sum > 0;
    }
}
