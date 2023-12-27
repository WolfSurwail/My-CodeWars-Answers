package com.wolfsurwail.kata.kyu7;

public class CountTheDigit {
    public static int nbDig(int n, int d) {
        int count = 0;
        for(int i = 0; i <= n; i++)
        {
            String s = String.valueOf(i * i);
            count += (s.length() - s.replaceAll(String.valueOf(d) , "").length());
        }
        return count;
    }
}
