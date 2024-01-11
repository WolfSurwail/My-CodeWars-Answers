package com.wolfsurwail.kata.kyu8;

public class TripleTrouble {
    public static String tripleTrouble(String one, String two, String three) {
        char[] chars1 = one.toCharArray();
        char[] chars2 = two.toCharArray();
        char[] chars3 = three.toCharArray();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < chars1.length; i++) {
            res.append(chars1[i]).append(chars2[i]).append(chars3[i]);
        }
        return res.toString();
    }
}
